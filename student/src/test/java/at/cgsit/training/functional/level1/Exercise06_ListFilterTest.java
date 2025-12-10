package at.cgsit.training.functional.level1;

import at.cgsit.training.functional.level2.Exercise06_ListFilter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise06_ListFilterTest {

    @Test
    void testFilterPositive() {
        List<Integer> input = List.of(-3, 0, 5, 7, -1);
        List<Integer> result = Exercise06_ListFilter.filter(input, v -> v > 0);

        assertEquals(List.of(5, 7), result);
    }

    @Test
    void testFilterEven() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = Exercise06_ListFilter.filter(input, v -> v % 2 == 0);

        assertEquals(List.of(2, 4, 6), result);
    }
}
