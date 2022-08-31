package com.cycleon.orderservice.order.repository;

@SuppressWarnings("ALL")
public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String message) {
        super(message);
    }
}
