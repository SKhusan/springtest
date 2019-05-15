package com.khusan.learn.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Author: Khusen Sharipov
 * Date: 08/05/2019
 * Time: 13:04
 */
public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5.0);
        assertEquals(new Dollar(10.0), five.times(2));
        assertEquals(new Dollar(15.0), five.times(3));
        assertEquals("USD", five.currency());
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5.0), new Dollar(5.0));
        assertNotEquals(new Dollar(5.0), new Frank(5.0));
    }

    @Test
    void testMultiplicationFrank() {
        Money five = Money.frank(5.0);
        assertEquals(new Frank(10.0), five.times(2));
        assertEquals(new Frank(15.0), five.times(3));
        assertEquals("CHF", five.currency());
    }

    @Test
    void testEqualityFrank() {
        assertEquals(new Frank(5.0), new Frank(5.0));
        assertNotEquals(new Frank(5.0), new Frank(6.0));
    }
}
