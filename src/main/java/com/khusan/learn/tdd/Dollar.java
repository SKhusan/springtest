package com.khusan.learn.tdd;

/**
 * Author: Khusen Sharipov
 * Date: 10/05/2019
 * Time: 12:21
 */
public class Dollar extends Money {

    public Dollar(double amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
