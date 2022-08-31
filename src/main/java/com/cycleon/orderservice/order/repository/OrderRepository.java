package com.cycleon.orderservice.order.repository;

import com.cycleon.orderservice.order.model.Order;
import org.springframework.lang.Nullable;

import java.util.Collection;

@SuppressWarnings("ALL")
public interface OrderRepository {

    Order getById(String orderId);

    Order findByCustomer(@Nullable String customerId);

    Order findByStatus(Order.Status status) throws OrderNotFoundException;

    Order save(Order order);

    Boolean delete(String orderId);

    Collection<Order> getAll();



}
