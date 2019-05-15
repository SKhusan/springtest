package com.khusan.learn.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 17:32
 */
@Tag("model")
public interface ModelTest {

    @BeforeEach
    default void beforeEachConsoleOutputer() {
    }
}
