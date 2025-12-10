package at.cgsit.training.functional.level3.exercise18;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.IntUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class Exercise18_OperationChainTest {

    @Test
    void testSimpleChain() {
        List<IntUnaryOperator> steps = List.of(
                x -> x + 1,   // 5 → 6
                x -> x * 2    // 6 → 12
        );

        int result = Exercise18_OperationChain.applyOperations(5, steps);

        assertEquals(12, result);
    }

    @Test
    void testLongerChain() {
        List<IntUnaryOperator> steps = List.of(
                x -> x - 1,   // 10 → 9
                x -> x * x,   // 9 → 81
                x -> x + 5    // 81 → 86
        );

        int result = Exercise18_OperationChain.applyOperations(10, steps);

        assertEquals(86, result);
    }

    @Test
    void testEmptyChain() {
        int result = Exercise18_OperationChain.applyOperations(42, List.of());
        assertEquals(42, result);
    }
}
