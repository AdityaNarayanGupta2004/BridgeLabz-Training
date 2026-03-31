package com.Aditya.sonar_qube.adressbook_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.Aditya.sonar_qube.adressbook.service.AddressBookService;

public class AddressBookServiceTest {

    @Test
    public void testServiceObject() {
        AddressBookService service = new AddressBookService();
        assertNotNull(service);
    }
}
