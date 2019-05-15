package com.khusan.learn.junit5;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 12:05
 */
public class Greeting {
    private static final String HELLO = "Hello";
    private static final String JUNIT = "Junit";

    public String helloJunit() {
        return HELLO.concat(" ").concat(JUNIT);
    }

    public String helloJunit(String name) {
        return HELLO.concat(" ").concat(name);
    }
}
