package at.cgsit.training.functional.level1;

import at.cgsit.training.functional.level2.Exercise09_StringLengthMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise09_StringLengthMapperTest {

    @Test
    void testMapToLength() {
        List<String> input = List.of("Hi", "Java", null, "");
        List<Integer> result = Exercise09_StringLengthMapper.mapToLength(input);

        assertEquals(List.of(2, 4, 0, 0), result);
    }
}
