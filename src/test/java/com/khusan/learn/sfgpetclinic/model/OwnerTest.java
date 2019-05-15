package com.khusan.learn.sfgpetclinic.model;

import com.khusan.learn.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 17:12
 */
public class OwnerTest implements ModelTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Khusan", "Sharipov");
        owner.setCity("Shafirkan");
        owner.setTelephone("+998909942751");

        assertAll("Properties test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Khusan", owner.getFirstName(), "First name didn't match"),
                        () -> assertEquals("Sharipov", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Shafirkan", owner.getCity(), "City name didn't match"),
                        () -> assertEquals("+998909942751", owner.getTelephone(), "Phone number didn't match"))
        );
    }

    @DisplayName("Value source")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @ValueSource(strings = {"Spring", "GWT", "JSF", "JEE"})
    void testValueSource(String val) {
        System.out.println(val);
    }

    @DisplayName("Enum source test")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @EnumSource(OwnerType.class)
    void enumTest(OwnerType ownerType) {
        System.out.println(ownerType);
    }

}
