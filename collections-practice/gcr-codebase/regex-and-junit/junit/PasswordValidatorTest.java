package junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("StrongPass9"));
        assertTrue(validator.isValid("Abcdefg8H"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(validator.isValid("Abc1"));
        assertFalse(validator.isValid("A1b2C3"));
    }

    @Test
    void testInvalidPasswordsNoUppercase() {
        assertFalse(validator.isValid("password1"));
        assertFalse(validator.isValid("mypassword9"));
    }

    @Test
    void testInvalidPasswordsNoDigit() {
        assertFalse(validator.isValid("Password"));
        assertFalse(validator.isValid("StrongPass"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}

