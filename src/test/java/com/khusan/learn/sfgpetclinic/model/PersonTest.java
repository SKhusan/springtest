package com.khusan.learn.sfgpetclinic.model;

import com.khusan.learn.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 14:37
 */
class PersonTest implements ModelTest {
    @RepeatedTest(value = 3)
    @DisplayName("repeatedTest")
    public void repeatedTest() {
        //toDo
    }

    @Test
    void groupedAssertions() {
        Person person = new Person(1L, "Khusan", "Sharipov");
        assertAll("Test person props set",
                () -> assertEquals(person.getFirstName(), "Khusan"),
                () -> assertEquals(person.getLastName(), "Sharipov"));
    }

    @Test
    void groupedAssertionsMsgs() {
        Person person = new Person(1L, "Khusan", "Sharipov");
        assertAll("Test person props set with msgs",
                () -> assertEquals(person.getFirstName(), "Khusan", "FirstName failed"),
                () -> assertEquals(person.getLastName(), "Sharipov", "Last name failed"));
    }

    @RepeatedTest(value = 3)
    @DisplayName("repeated test1 ")
    void repeatedTest1(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        testInfo.getTags().forEach(tag -> {
            System.out.println(repetitionInfo.getCurrentRepetition() + " " + tag);
        });
    }
}