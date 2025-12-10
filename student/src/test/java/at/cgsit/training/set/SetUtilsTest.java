package at.cgsit.training.set;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetUtilsTest {

    // ---------------------------------------------------------
    @Test
    void testIntersection() {
        Set<Integer> a = Set.of(1,2,3,4);
        Set<Integer> b = Set.of(3,4,5);

        Set<Integer> result = SetUtils.intersection(a, b);
        assertEquals(Set.of(3,4), result);
    }

    // ---------------------------------------------------------
    @Test
    void testUnion() {
        Set<Integer> a = Set.of(1,2);
        Set<Integer> b = Set.of(2,3);

        Set<Integer> result = SetUtils.union(a, b);
        assertEquals(Set.of(1,2,3), result);
    }

    // ---------------------------------------------------------
    @Test
    void testDifference() {
        Set<Integer> a = Set.of(1,2,3,4);
        Set<Integer> b = Set.of(2,4);

        Set<Integer> result = SetUtils.difference(a, b);
        assertEquals(Set.of(1,3), result);
    }

    // ---------------------------------------------------------
    @Test
    void testSymmetricDifference() {
        Set<Integer> a = Set.of(1,2,3);
        Set<Integer> b = Set.of(3,4);

        Set<Integer> result = SetUtils.symmetricDifference(a, b);
        assertEquals(Set.of(1,2,4), result);
    }

    // ---------------------------------------------------------
    @Test
    void testAreDisjoint() {
        assertTrue(SetUtils.areDisjoint(Set.of(1,2), Set.of(3,4)));
        assertFalse(SetUtils.areDisjoint(Set.of(1,2), Set.of(2,3)));
    }

    // ---------------------------------------------------------
    @Test
    void testIsSubset() {
        assertTrue(SetUtils.isSubset(Set.of(1,2), Set.of(1,2,3)));
        assertFalse(SetUtils.isSubset(Set.of(1,4), Set.of(1,2,3)));
    }

    // ---------------------------------------------------------
    @Test
    void testAllElementsUnique() {
        assertTrue(SetUtils.allElementsUnique(List.of(1,2,3)));
        assertFalse(SetUtils.allElementsUnique(List.of(1,2,2)));
    }

    // ---------------------------------------------------------
    @Test
    void testFrequencyMap() {
        List<String> words = List.of("a","b","a","c","b","a");

        Map<String,Integer> result = SetUtils.frequencyMap(words);

        assertEquals(3, result.get("a"));
        assertEquals(2, result.get("b"));
        assertEquals(1, result.get("c"));
    }

    // ---------------------------------------------------------
    @Test
    void testCategorizeWords() {
        Set<String> fruits = Set.of("apple", "pear");
        Set<String> animals = Set.of("cat", "dog");

        List<String> words = List.of("apple", "cat", "car");

        Map<String,String> result =
                SetUtils.categorizeWords(words, fruits, animals);

        assertEquals("fruit", result.get("apple"));
        assertEquals("animal", result.get("cat"));
        assertEquals("unknown", result.get("car"));
    }

    // ---------------------------------------------------------
    @Test
    void testHaveSameElementsIgnoringDuplicates() {
        List<Integer> a = List.of(1,1,2,3);
        List<Integer> b = List.of(3,2,1);

        assertTrue(SetUtils.haveSameElementsIgnoringDuplicates(a, b));

        List<Integer> c = List.of(1,2,5);
        assertFalse(SetUtils.haveSameElementsIgnoringDuplicates(a, c));
    }
}
