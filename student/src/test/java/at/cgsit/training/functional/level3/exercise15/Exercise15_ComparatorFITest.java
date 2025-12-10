package at.cgsit.training.functional.level3.exercise15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise15_ComparatorFITest {

    @Test
    void testLengthComparator() {
        ComparatorFI<String> cmp =
                Exercise15_ComparatorFI.createLengthComparator();

        assertTrue(cmp.compare("Hi", "World") < 0);
        assertTrue(cmp.compare("Hello", "Hi") > 0);
        assertEquals(0, cmp.compare("ABC", "XYZ"));
    }
}
