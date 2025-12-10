package at.cgsit.training.functional.level3.exercise11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise11_TriFunctionTest {

    @Test
    void testAverageFunction() {
        TriFunction<Integer, Integer, Integer, Double> f =
                Exercise11_TriFunction.createAverageFunction();

        assertEquals(2.0, f.apply(1, 2, 3));
        assertEquals(5.0, f.apply(5, 5, 5));
        assertEquals(0.0, f.apply(-1, 0, 1));
    }
}
