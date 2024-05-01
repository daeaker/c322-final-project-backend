package edu.iu.daeaker.c322finalprojectbackend.repository;

import edu.iu.daeaker.c322finalprojectbackend.model.Flower;
import edu.iu.daeaker.c322finalprojectbackend.model.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.lang.System;

@Component
public class OrderRepository {


    private String DATABASE_NAME = "flowers/orders.txt";
    private static final String NEW_LINE = System.lineSeparator();

    private static void appendToFile(Path path, String content)
            throws IOException {
        Files.write(path,
                content.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }


    public OrderRepository() {}


    public int add(Order order) throws IOException {
        System.out.println(order.getFirstName());
        String data = order.toLine(-1);
        List<Order> lines = this.findAll();
        int id = lines.size() + 1;


        String[] list = data.split(",");
        list[0] = String.valueOf(id);
        data = list[0] + "," + list[1] + "," + list[2] + "," + list[3] + "," + list[4] + "," + list[5] + "," + list[6];


        Path path = Paths.get(DATABASE_NAME);
        appendToFile(path, data + NEW_LINE);
        return id;
    }

    public List<Order> findAll() throws IOException {
        List<Order> result = new ArrayList<>();
        Path path = Paths.get(DATABASE_NAME);
        List<String> data = Files.readAllLines(path);
        for (String line : data) {
            if(!line.trim().isEmpty()) {
                Order d = new Order();
                d = Order.fromLine(line);
                result.add(d);
            }
        }

        return result;
    }


    public List<Order> find(int customerId) throws IOException {
        List<Order> orders = findAll();
        List<Order> result = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i).getId());
            Order order = new Order();
            order.setId(orders.get(i).getId());
            order.setCustomerId(orders.get(i).getCustomerId());
            if (order.getCustomerId() == customerId) {
                result.add(order);
            }
        }
        return result;
    }
}





