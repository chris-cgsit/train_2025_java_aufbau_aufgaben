package at.cgsit.training.functional.level3.exercise10;

import at.cgsit.training.functional.level3.exercise10.Exercise10_ListReducer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise10_ListReducerTest {

    @Test
    void testSumReduction() {
        List<Integer> values = List.of(1, 2, 3, 4);
        int result = Exercise10_ListReducer.reduce(values, 0, Integer::sum);

        assertEquals(10, result);
    }

    @Test
    void testMaxReduction() {
        List<Integer> values = List.of(5, 2, 9, 1);
        int result = Exercise10_ListReducer.reduce(values, Integer.MIN_VALUE,
                (acc, v) -> Math.max(acc, v));

        assertEquals(9, result);
    }
}
