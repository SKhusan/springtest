package com.khusan.learn.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 17:31
 */
@Tag("controllers")
public interface ControllerTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Controller tests before all......");
    }
}
