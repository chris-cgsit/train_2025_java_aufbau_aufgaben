package at.cgsit.training.functional.level3.exercise13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise13_ValidatorTest {

    @Test
    void testEmailValidator() {
        Validator<String> validator =
                Exercise13_Validator.createEmailValidator();

        assertTrue(validator.isValid("test@example.com"));
        assertFalse(validator.isValid("invalid"));
        assertFalse(validator.isValid(null));
    }
}
