package at.cgsit.training.functional.level3.exercise14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise14_MergerTest {

    @Test
    void testStringMerger() {
        Merger<String> merger = Exercise14_Merger.createStringMerger();

        assertEquals("A + B", merger.merge("A", "B"));
        assertEquals("Hello + World", merger.merge("Hello", "World"));
    }
}
