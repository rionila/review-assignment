package com.cycleon.orderservice.order;

import com.cycleon.orderservice.order.controller.OrderCreateRequest;
import com.cycleon.orderservice.order.model.Order;

import java.util.UUID;

@SuppressWarnings("ALL")
public interface OrderService {

    Order getById(UUID uuid);

    Order save(OrderCreateRequest order);

    Boolean delete(UUID uuid);
}
