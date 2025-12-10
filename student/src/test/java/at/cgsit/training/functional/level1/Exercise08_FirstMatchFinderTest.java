package at.cgsit.training.functional.level1;

import at.cgsit.training.functional.level2.Exercise08_FirstMatchFinder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class Exercise08_FirstMatchFinderTest {

    @Test
    void testFindFirstStartingWithA() {
        List<String> input = List.of("Chris", "Alex", "Bob");
        Optional<String> result =
                Exercise08_FirstMatchFinder.findFirst(input, s -> s.startsWith("A"));

        assertTrue(result.isPresent());
        assertEquals("Alex", result.get());
    }

    @Test
    void testNoMatch() {
        List<String> input = List.of("Chris", "Bob");
        Optional<String> result =
                Exercise08_FirstMatchFinder.findFirst(input, s -> s.startsWith("A"));

        assertTrue(result.isEmpty());
    }
}
