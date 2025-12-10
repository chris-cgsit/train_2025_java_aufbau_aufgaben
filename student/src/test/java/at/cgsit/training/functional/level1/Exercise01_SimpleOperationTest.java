package at.cgsit.training.functional.level1;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise01_SimpleOperationTest {

    @Test
    void testAdditionOperation() {
        BiFunction<Integer, Integer, Integer> op =
                Exercise01_SimpleOperation.createAdditionOperation();

        assertEquals(5, op.apply(2, 3));
        assertEquals(0, op.apply(-2, 2));
        assertEquals(-7, op.apply(-3, -4));
    }
}
