package com.khusan.learn.tdd;

/**
 * Author: Khusen Sharipov
 * Date: 10/05/2019
 * Time: 15:41
 */
public abstract class Money {
    protected double amount;
    protected String currency;

    public static Money dollar(double amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return money.amount == this.amount
                && this.getClass().equals(money.getClass())
                && this.currency.equals(money.currency);
    }

    public static Money frank(double amount) {
        return new Frank(amount);
    }

    public abstract Money times(int multiplier);

    public abstract String currency();
}
