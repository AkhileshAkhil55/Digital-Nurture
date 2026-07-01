package jass.unit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator;

    // Test Fixture + Setup Method
    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
        System.out.println("Setup: PasswordValidator object created");
    }

    // Test 1
    @Test
    void testValidPassword() {

        // Arrange
        String password = "password123";

        // Act
        boolean result = validator.isValid(password);

        // Assert
        assertTrue(result);
    }

    // Test 2
    @Test
    void testShortPassword() {

        // Arrange
        String password = "pass";

        // Act
        boolean result = validator.isValid(password);

        // Assert
        assertFalse(result);
    }

    // Test 3
    @Test
    void testNullPassword() {

        // Arrange
        String password = null;

        // Act
        boolean result = validator.isValid(password);

        // Assert
        assertFalse(result);
    }

    // Test 4
    @Test
    void testPasswordLength() {

        // Arrange
        String password = "abcdefgh";

        // Act
        boolean result = validator.isValid(password);

        // Assert
        assertEquals(true, result);
    }

    // Teardown Method
    @AfterEach
    void tearDown() {
        System.out.println("Teardown: Test Completed");
    }
}