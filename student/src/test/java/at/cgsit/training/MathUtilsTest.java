package at.cgsit.training;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

    @Test
    void testSumPositive() {
        List<Integer> list = List.of(-5, 3, 0, 8, -1);
        int result = MathUtils.sumPositive(list);
        assertEquals(11, result);  // 3 + 8
    }

    @Test
    void testEmptyList() {
        assertEquals(0, MathUtils.sumPositive(List.of()));
    }

    @Test
    void testAllNegative() {
        assertEquals(0, MathUtils.sumPositive(List.of(-1, -2, -3)));
    }
}
