package at.cgsit.training.functional.level3.exercise20;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class Exercise20_BenchmarkRunnerTest {

    @Test
    void testBenchmarkReturnsResult() {
        Supplier<String> op = () -> "Hello";

        BenchmarkResult<String> result =
                Exercise20_BenchmarkRunner.benchmark(op);

        assertEquals("Hello", result.result());
        assertTrue(result.durationNanos() >= 0);
    }

    @Test
    void testBenchmarkTimeIncreases() {
        Supplier<Integer> op = () -> {
            try {
                Thread.sleep(10); // bewusst langsam
            } catch (InterruptedException ignored) {}
            return 123;
        };

        BenchmarkResult<Integer> result =
                Exercise20_BenchmarkRunner.benchmark(op);

        assertEquals(123, result.result());
        assertTrue(result.durationNanos() > 5_000_000); // > 5 ms
    }
}
