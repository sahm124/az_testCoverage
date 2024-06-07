package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testGetName() {
        Person person = new Person();
        person.setName("John Doe");
        assertEquals("John Doe", person.getName());
    }

    @Test
    public void testGetAge() {
        Person person = new Person();
        person.setAge(30);
        assertEquals(30, person.getAge());
    }

    @Test
    public void testGetGender() {
        Person person = new Person();
        person.setGender(Gender.M);
        assertEquals(Gender.M, person.getGender());
    }

    @Test
    public void testPersonSerialization() {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setGender(Gender.M);

        try (java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
             java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos)) {
            oos.writeObject(person);
            try (java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
                 java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais)) {
                Person deserializedPerson = (Person) ois.readObject();
                assertEquals(person.getName(), deserializedPerson.getName());
                assertEquals(person.getAge(), deserializedPerson.getAge());
                assertEquals(person.getGender(), deserializedPerson.getGender());
            }
        } catch (Exception e) {
            fail("Serialization test failed: " + e.getMessage());
        }
    }
}
