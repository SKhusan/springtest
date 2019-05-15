package com.khusan.learn.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 12:19
 */
public class GreetingTest {

    static Greeting greeting;

    @Test
    public void helloJunit() {
        System.out.println(greeting.helloJunit());
    }

    @Test
    public void helloJunit1() {
        System.out.println(greeting.helloJunit("Khusan"));
    }

    @Test
    public void helloJunit2() {
        System.out.println(greeting.helloJunit("Olya"));
    }

    @BeforeAll
    static void setUp() {
        System.out.println("in before all.....");
        greeting = new Greeting();
    }




    @AfterAll
    static void tearDown() {
        System.out.println("in after all");
    }
}
