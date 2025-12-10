package at.cgsit.training.streams.level1.exercise02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02_MapNamesToUpperCaseTest {

    @Test
    void testUppercaseMapping() {
        List<String> names = List.of("anna", "Bob", "CHRIS");
        List<String> result = Exercise02_MapNamesToUpperCase.mapToUpperCase(names);

        assertEquals(List.of("ANNA", "BOB", "CHRIS"), result);
    }

    @Test
    void testEmptyList() {
        List<String> result = Exercise02_MapNamesToUpperCase.mapToUpperCase(List.of());
        assertTrue(result.isEmpty());
    }

    @Test
    void testMixedCase() {
        List<String> result = Exercise02_MapNamesToUpperCase
                .mapToUpperCase(List.of("a", "B", "c"));

        assertEquals(List.of("A", "B", "C"), result);
    }
}
