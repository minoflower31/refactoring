package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.after;

import me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void person() {
        Person person = new Person();
        person.setId(10);
        person.setName("keesun");
        assertEquals(10, person.getId());
        assertEquals("keesun", person.getName());
        person.setName("whiteship");
        assertEquals("whiteship", person.getName());
    }

}