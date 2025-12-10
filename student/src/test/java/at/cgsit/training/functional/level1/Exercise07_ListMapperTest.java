package at.cgsit.training.functional.level1;

import at.cgsit.training.functional.level2.Exercise07_ListMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise07_ListMapperTest {

    @Test
    void testDoubleValues() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> result = Exercise07_ListMapper.map(input, v -> v * 2);

        assertEquals(List.of(2, 4, 6), result);
    }

    @Test
    void testSquareValues() {
        List<Integer> input = List.of(2, 3, 4);
        List<Integer> result = Exercise07_ListMapper.map(input, v -> v * v);

        assertEquals(List.of(4, 9, 16), result);
    }
}
