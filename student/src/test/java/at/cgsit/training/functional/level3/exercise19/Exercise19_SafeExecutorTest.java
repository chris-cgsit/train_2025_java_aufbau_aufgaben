package at.cgsit.training.functional.level3.exercise19;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class Exercise19_SafeExecutorTest {

    @Test
    void testSuccessCase() {
        Supplier<String> supplier = () -> "OK";

        Optional<String> result =
                Exercise19_SafeExecutor.executeSafely(supplier);

        assertTrue(result.isPresent());
        assertEquals("OK", result.get());
    }

    @Test
    void testFailureCase() {
        Supplier<String> supplier = () -> {
            throw new RuntimeException("Boom");
        };

        Optional<String> result =
                Exercise19_SafeExecutor.executeSafely(supplier);

        assertTrue(result.isEmpty());
    }

    @Test
    void testIntegerParsing() {
        Supplier<Integer> supplier = () -> Integer.parseInt("123");
        Optional<Integer> result =
                Exercise19_SafeExecutor.executeSafely(supplier);

        assertEquals(Optional.of(123), result);
    }

    @Test
    void testParsingFails() {
        Supplier<Integer> supplier = () -> Integer.parseInt("NaN");
        Optional<Integer> result =
                Exercise19_SafeExecutor.executeSafely(supplier);

        assertTrue(result.isEmpty());
    }
}
