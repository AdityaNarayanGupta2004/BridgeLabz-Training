package com.Aditya.sonar_qube.adressbook_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Aditya.sonar_qube.adressbook.dao.AddressBookDao;
import com.Aditya.sonar_qube.adressbook.model.Contacts;

public class AddressBookDaoTest {

    private AddressBookDao dao;
    private Contacts contact1;
    private Contacts contact2;

    @BeforeEach
    public void setUp() {
        dao = new AddressBookDao();
        contact1 = new Contacts("Aditya", "Gupta", "Mathura", "Mathura", "1234567895", "UP", "123456", "a@gmail.com");
        contact2 = new Contacts("Rahul", "Sharma", "Agra", "Agra", "9876543210", "UP", "654321", "r@gmail.com");
        dao.addContact(contact1);
    }

    @Test
    public void testAddContact() {
        boolean added = dao.addContact(contact2);
        assertTrue(added); // contact2 should be added
    }

    @Test
    public void testDuplicateContact() {
        boolean added = dao.addContact(contact1);
        assertFalse(added); // duplicate, should not add
    }

    @Test
    public void testEditContact() {
        Contacts updated = new Contacts("Aditya", "Gupta", "NewAddress", "NewCity", "1112223333", "UP", "999999", "new@gmail.com");
        boolean edited = dao.editContact("Aditya", "Gupta", updated);
        assertTrue(edited); // should edit successfully

        // Verify updated info
        boolean duplicateCheck = dao.addContact(new Contacts("Aditya", "Gupta", "Any", "Any", "000", "UP", "000", "any@gmail.com"));
        assertFalse(duplicateCheck); // still considered duplicate after edit
    }

    @Test
    public void testDeleteContact() {
        boolean deleted = dao.deleteContact("Aditya", "Gupta");
        assertTrue(deleted); // should delete successfully

        boolean deleteAgain = dao.deleteContact("Aditya", "Gupta");
        assertFalse(deleteAgain); // should fail
    }

    @Test
    public void testSearchPerson() {
        dao.addContact(contact2);
        
        dao.searchPerson("Mathura");
        dao.searchPerson("Agra");
        dao.searchPerson("NoCity"); // should show nothing
    }
}
