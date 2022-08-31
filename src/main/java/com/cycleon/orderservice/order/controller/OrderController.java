package com.cycleon.orderservice.order.controller;

import com.cycleon.orderservice.order.OrderService;
import com.cycleon.orderservice.order.model.Order;
import com.cycleon.orderservice.order.repository.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@SuppressWarnings("ALL")
@RestController("/v1/api")
public class OrderController {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderController(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public Order getOrder(@RequestParam String orderId){
        return orderRepository.getById(orderId);
    }

    @GetMapping("/orders/")
    public Order save(@RequestBody OrderCreateRequest createRequest){
        return orderService.save(createRequest);
    }

    @PostMapping("/orders/delete/{orderId}")
    public ResponseEntity<String> delete(@PathVariable UUID orderId){
         try{
             orderService.delete(orderId);
             return ResponseEntity.status(200).body("Order successfully deleted");
         } catch (Exception e){
             return ResponseEntity.status(200).body("Error delete failed");
         }
    }
}
