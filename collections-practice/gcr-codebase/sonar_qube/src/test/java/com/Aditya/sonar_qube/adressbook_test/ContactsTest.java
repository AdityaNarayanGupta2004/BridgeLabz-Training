package com.Aditya.sonar_qube.adressbook_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.Aditya.sonar_qube.adressbook.model.Contacts;

public class ContactsTest {

    @Test
    public void testContactCreation() {
        Contacts contact = new Contacts(
                "Aditya",
                "Gupta",
                "Mathura",
                "Mathura",
                "1234567895",
                "UP",
                "123456",
                "abc@gmail.com"
        );

        assertEquals("Aditya", contact.getfirstName());
        assertEquals("Gupta", contact.getlastName());
        assertEquals("Mathura", contact.getaddress());
        assertEquals("Mathura", contact.getcity());
        assertEquals("1234567895", contact.getphoneNumber());
        assertEquals("UP", contact.getstate());
        assertEquals("123456", contact.getZip());
        assertEquals("abc@gmail.com", contact.getemail());
    }
}
