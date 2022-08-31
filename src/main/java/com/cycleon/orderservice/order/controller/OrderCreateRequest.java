package com.cycleon.orderservice.order.controller;

import java.util.List;

@SuppressWarnings("ALL")
public class OrderCreateRequest {
    private final String customerId;
    private final List<String> products;

    public OrderCreateRequest(String customerId, List<String> products) {
        this.customerId = customerId;
        this.products = products;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getProducts() {
        return products;
    }
}
