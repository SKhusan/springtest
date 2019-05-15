package com.khusan.learn.sfgpetclinic.controllers;

import com.khusan.learn.sfgpetclinic.ControllerTest;
import com.khusan.learn.sfgpetclinic.exceptions.ValueNotFoundException;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 14:28
 */
class IndexControllerTest implements ControllerTest {

    IndexController indexController;

    @DisplayName("Test proper view name is returned for index page")
    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(), "Wrong View Returned");
        assertThat(indexController.index()).isEqualTo("index");
    }

    @DisplayName("Test exception")
    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            indexController.oupsHandler();
        });
    }

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }


    @DisplayName("Assumption test")
    @Disabled
    @Test
    void testAssumptionTrue() {
        Assumptions.assumeTrue("Khusan".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

}