package edu.iu.daeaker.c322finalprojectbackend.controllers;

import edu.iu.daeaker.c322finalprojectbackend.model.Order;
import edu.iu.daeaker.c322finalprojectbackend.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @PostMapping
    public int add(@RequestBody Order order) {
        try {
            return orderRepository.add(order);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/{id}")
    public List<Order> find(@PathVariable("id") int id) {
        try {
            return orderRepository.find(id);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }



}
