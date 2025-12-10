package at.cgsit.training.functional.level1;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Exercise02_StringMapperTest {

    @Test
    void testUppercaseMapper() {
        Function<String, String> mapper =
                Exercise02_StringMapper.createUppercaseMapper();

        assertEquals("HELLO", mapper.apply("hello"));
        assertEquals("", mapper.apply(""));
        assertNull(mapper.apply(null));
    }
}
