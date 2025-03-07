package rocks.zipcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



// Student should write this test class
public class PasswordValidatorTest {

    private PasswordValidator validator;

    public void setUp(){
        this.validator = new PasswordValidator();
    }
    // TODO: Write tests for the PasswordValidator class
    // Test cases should include:
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 20;
    // - Valid passwords
    @Test
    public void isValidPassword(){
        setUp();
        assertTrue(validator.isValid("ValidPassword-1"));
        assertTrue(validator.isValid("Another3xample!"));
        assertTrue(validator.isValid("0neMore4-theRoad"));
        assertFalse(validator.isValid("short"));
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid(("12345")));
        assertFalse(validator.isValid("ALLUPPERCASE"));
        assertFalse(validator.isValid("alllowercase"));
        assertFalse(validator.isValid("thispasswordisWAYT00LONG!andwontworkinthisapplicationsotryagainkris"));
        assertFalse(validator.isValid(""));
        assertFalse(validator.isValid("!!!???---+++==="));
    }
    // - Passwords that are too short or too long
    // - Passwords missing uppercase, lowercase, digits, or special chars
    // - Edge cases like null or empty strings
}
