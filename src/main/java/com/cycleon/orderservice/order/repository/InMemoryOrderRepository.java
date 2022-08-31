package com.cycleon.orderservice.order.repository;

import com.cycleon.orderservice.order.model.Order;
import org.springframework.stereotype.Repository;

import java.util.*;

@SuppressWarnings("ALL")
@Repository
public class InMemoryOrderRepository implements OrderRepository {

    private final Map<String, Order> orders = new HashMap<>();

    @Override
    public Order getById(String orderId) {
        return orders.get(orderId);
    }

    @Override
    public Order findByCustomer(String customerId) {
        return orders.values()
                .stream()
                .filter(order -> order.getCustomerId().equals(customerId))
                .findFirst()
                .get();
    }

    @Override
    public Order findByStatus(Order.Status status) throws OrderNotFoundException {
        for (Order order : orders.values()){
            if (order.getStatus() == status){
                return order;
            }
        }
        //Not found
        throw new OrderNotFoundException("No orders with status: "+status);
    }

    @Override
    public Order save(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Boolean delete(String orderId) {
        Order order = getById(orderId);
        if(orders.containsValue(order)){
            orders.remove(orderId,order);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public Collection<Order> getAll() {
        return new ArrayList<>(orders.values());
    }
}
