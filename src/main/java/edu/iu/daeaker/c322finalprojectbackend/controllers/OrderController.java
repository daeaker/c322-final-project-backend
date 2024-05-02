package edu.iu.daeaker.c322finalprojectbackend.controllers;

import edu.iu.daeaker.c322finalprojectbackend.model.Order;
import edu.iu.daeaker.c322finalprojectbackend.repository.OrderFileRepository;
import edu.iu.daeaker.c322finalprojectbackend.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    private OrderFileRepository orderFileRepository;
    private OrderRepository orderRepository;

    public OrderController(OrderFileRepository orderFileRepository, OrderRepository orderRepository) {
        this.orderFileRepository = orderFileRepository;
        this.orderRepository = orderRepository;
    }


    @PostMapping
    public int add(@RequestBody Order order) {
        try {
            return orderFileRepository.add(order);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/{id}")
    public List<Order> find(@PathVariable("id") int id) {
        try {
            return orderFileRepository.find(id);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }



}
