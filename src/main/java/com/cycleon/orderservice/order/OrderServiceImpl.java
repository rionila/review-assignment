package com.cycleon.orderservice.order;

import com.cycleon.orderservice.order.controller.OrderCreateRequest;
import com.cycleon.orderservice.order.model.Order;
import com.cycleon.orderservice.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@SuppressWarnings("ALL")
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getById(UUID uuid) {
        return orderRepository.getById(uuid.toString());
    }

    @Override
    public Order save(OrderCreateRequest createRequest) {
        UUID orderId = UUID.randomUUID();
        String productsAsString = String.join(",",createRequest.getProducts());
        Order order = new Order(orderId.toString(), createRequest.getCustomerId(),productsAsString);
        return orderRepository.save(order);
    }

    @Override
    public Boolean delete(UUID uuid) {
        Order order = this.getById(uuid);
        return orderRepository.delete(order.getId());
    }
}
