package at.cgsit.training.functional.level3.exercise12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise12_ConverterTest {

    @Test
    void testStringToIntConverter() {
        Converter<String, Integer> conv =
                Exercise12_Converter.createStringToIntConverter();

        assertEquals(42, conv.convert("42"));
        assertEquals(0, conv.convert("0"));
        assertEquals(-5, conv.convert("-5"));
    }
}
