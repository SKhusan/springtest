package com.khusan.learn.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Author: Khusen Sharipov
 * Date: 15/05/2019
 * Time: 15:07
 */
public class InlineMockTest {

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

    @Test
    void testInlineMock() {
        Map mapMock = mock(Map.class);
        assertEquals(mapMock.size(), 0);

    }
}
