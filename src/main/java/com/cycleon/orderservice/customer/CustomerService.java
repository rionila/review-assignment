package com.cycleon.orderservice.customer;

import com.cycleon.orderservice.order.model.Order;

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("ALL")
public interface CustomerService {

    Order getOrderById(String OrderId);

    /**
        Method for customer to transfer money to the account.
        @param amount - amount of money added to account of customer
     */
    void calculateDiscount(BigDecimal totalAmount, List<Order> orders);

    void getCustomerbyId(String customerId);
}
