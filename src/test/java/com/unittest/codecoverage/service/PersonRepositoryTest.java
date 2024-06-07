package com.unittest.codecoverage.repositories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.models.Gender;

public class PersonRepositoryTest {

    @Test
    public void testInsert() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setGender(Gender.M);

        Person insertedPerson = repository.insert(person);
        assertNotNull(insertedPerson);
        assertEquals(person.getName(), insertedPerson.getName());
    }

    @Test
    public void testUpdate() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setGender(Gender.M);

        repository.update(person);
    }

    @Test
    public void testDelete() {
        PersonRepository repository = new PersonRepository();
        repository.delete("John Doe");
    }

    @Test
    public void testGet() {
        PersonRepository repository = new PersonRepository();
        Person person = repository.get("John Doe");
        assertNull(person);
    }
}
