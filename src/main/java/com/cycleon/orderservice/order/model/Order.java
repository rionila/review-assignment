package com.cycleon.orderservice.order.model;

import com.cycleon.orderservice.infrastructure.messaging.MessageHandler;

@SuppressWarnings("ALL")
public class Order {

    public enum Status {
        PLACED, PROCESSING, DONE
    }

    private final String id;
    private final String customerId;
    private Status status;
    private final String products;

    public Order(String id, String customerId, String products) {
        this.id = id;
        this.customerId = customerId;
        this.status = Status.PLACED;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Status getStatus() {
        return status;
    }

    public String getProducts() {
        return products;
    }

    public String getCssColor(){
        String color;
        if (status == Status.PLACED) {
            color = "#006400FF"; // Dark green
        } else if (status == Status.PROCESSING) {
            color = "#00008BFF"; // Dark Blue
        } else {
            color = "#8B0000FF"; // Dark Red
        }
        return "background-color: "+ color;
    }

    public void setStatus(){
        this.status = Status.PROCESSING;
        String message = String.format("The order with id: %s is now being processed", this.id);
        MessageHandler.send(message, "emailserver.pro.cycleon.com");
    }
}
