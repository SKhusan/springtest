package com.khusan.learn.tdd;

/**
 * Author: Khusen Sharipov
 * Date: 10/05/2019
 * Time: 14:47
 */
public class Frank extends Money {

    public Frank(double amount) {
        this.amount = amount;
        this.currency = "CHF";
    }


    @Override
    public Money times(int multiplier) {
        return new Frank(this.amount * multiplier);
    }

    @Override
    public String currency() {
        return this.currency;
    }

}
