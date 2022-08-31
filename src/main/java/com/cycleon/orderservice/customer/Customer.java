package com.cycleon.orderservice.customer;

import java.math.BigDecimal;

@SuppressWarnings("ALL")
public class Customer {

    private final String customerId;
    private final String firstName;
    private final String lastName;
    private final BigDecimal moneyInAccount;

    public Customer(String customerId, String firstName, String lastName, BigDecimal moneyInAccount) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyInAccount = moneyInAccount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getMoneyInAccount() {
        return moneyInAccount;
    }
}
