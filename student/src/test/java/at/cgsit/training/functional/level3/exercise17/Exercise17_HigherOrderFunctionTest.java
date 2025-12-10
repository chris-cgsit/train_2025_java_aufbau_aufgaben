package at.cgsit.training.functional.level3.exercise17;

import org.junit.jupiter.api.Test;

import java.util.function.IntUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class Exercise17_HigherOrderFunctionTest {

    @Test
    void testMultiplier3() {
        IntUnaryOperator op = Exercise17_HigherOrderFunction.getMultiplier(3);
        assertEquals(15, op.applyAsInt(5));
        assertEquals(9, op.applyAsInt(3));
    }

    @Test
    void testMultiplier5() {
        IntUnaryOperator op = Exercise17_HigherOrderFunction.getMultiplier(5);
        assertEquals(25, op.applyAsInt(5));
        assertEquals(50, op.applyAsInt(10));
    }

    @Test
    void testMultiplierZero() {
        IntUnaryOperator op = Exercise17_HigherOrderFunction.getMultiplier(0);
        assertEquals(0, op.applyAsInt(100));
    }
}
