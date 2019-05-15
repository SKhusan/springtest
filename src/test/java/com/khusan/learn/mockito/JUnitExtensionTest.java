package com.khusan.learn.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * Author: Khusen Sharipov
 * Date: 15/05/2019
 * Time: 15:55
 */

public class JUnitExtensionTest {

    @Mock
    Map<String, Object> annotatedMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testAnnotatedMock() {
        annotatedMock.put("nameKey", "nameValue");
    }
}
