package com.unittest.codecoverage.models;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "M, John Doe, 30",
            "M, Jane Doe, 25",
            "M, Jim Beam, 40"
    })
    public void testPersonConstructor(Gender gender, String name, int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
        assertEquals(gender, person.getGender());
    }
}
