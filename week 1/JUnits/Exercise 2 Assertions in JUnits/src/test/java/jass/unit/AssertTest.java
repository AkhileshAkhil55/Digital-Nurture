package jass.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    Assert student = new Assert("Akhilesh", 80);

    // assertEquals()
    @Test
    void testGetName() {
        assertEquals("Akhilesh", student.getName());
    }

    // assertTrue()
    @Test
    void testPassed() {
        assertTrue(student.isPassed());
    }

    // assertFalse()
    @Test
    void testScholarship() {
        assertFalse(student.isScholarshipEligible());
    }

    // assertThrows()
    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            student.divideMarks(0);
        });
    }
}