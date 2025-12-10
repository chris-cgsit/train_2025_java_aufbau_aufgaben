package at.cgsit.training.list;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    // -------------------------
    // Exercise 01
    // -------------------------
    @Test
    void testRemoveDuplicatesPreserveOrder() {
        List<Integer> input = List.of(1,2,1,3,2,4);
        List<Integer> result = ListUtils.removeDuplicatesPreserveOrder(input);
        assertEquals(List.of(1,2,3,4), result);
    }

    // -------------------------
    // Exercise 02
    // -------------------------
    @Test
    void testSplitEvenAndOdd() {
        List<Integer> input = List.of(1,2,3,4,5);
        var result = ListUtils.splitEvenAndOdd(input);

        assertEquals(List.of(2,4), result.even());
        assertEquals(List.of(1,3,5), result.odd());
    }

    // -------------------------
    // Exercise 03
    // -------------------------
    @Test
    void testRotateRight() {
        List<String> input = List.of("A", "B", "C", "D");
        List<String> result = ListUtils.rotateRight(input, 1);
        assertEquals(List.of("D","A","B","C"), result);
    }

    // -------------------------
    // Exercise 04
    // -------------------------
    @Test
    void testCalculateStats() {
        List<Double> input = List.of(10.0, 20.0, 30.0);
        var stats = ListUtils.calculateStats(input);

        assertEquals(10.0, stats.min(), 0.0001);
        assertEquals(30.0, stats.max(), 0.0001);
        assertEquals(20.0, stats.avg(), 0.0001);
    }

    // -------------------------
    // Exercise 05
    // -------------------------
    @Test
    void testRemoveNullAndEmpty() {
        List<String> input = Arrays.asList("A", null, "", " ", "B", "   ", "C");
        List<String> result = ListUtils.removeNullAndEmpty(input);

        assertEquals(List.of("A", "B", "C"), result);
    }

    // -------------------------
    // Exercise 06
    // -------------------------
    @Test
    void testInsertSeparatorAfterEach() {
        List<String> input = List.of("A", "B", "C");
        List<String> result = ListUtils.insertSeparatorAfterEach(input, "-");

        assertEquals(List.of("A","-","B","-","C","-"), result);
    }

    // -------------------------
    // Exercise 07
    // -------------------------
    @Test
    void testReverseList() {
        List<Integer> input = List.of(1,2,3,4);
        List<Integer> result = ListUtils.reverseList(input);

        assertEquals(List.of(4,3,2,1), result);
    }

    // -------------------------
    // Exercise 08
    // -------------------------
    @Test
    void testFindPairsWithSum() {
        List<Integer> input = List.of(1,2,3,4,5);
        List<ListUtils.Pair> result = ListUtils.findPairsWithSum(input, 6);

        assertTrue(result.contains(new ListUtils.Pair(1,5)));
        assertTrue(result.contains(new ListUtils.Pair(2,4)));
        assertEquals(2, result.size());
    }

    // -------------------------
    // Exercise 09
    // -------------------------
    @Test
    void testGroupByFirstLetter() {
        List<String> input = List.of("Apple", "Ape", "Banana", "Blue");
        Map<Character, List<String>> map = ListUtils.groupByFirstLetter(input);

        assertEquals(List.of("Apple","Ape"), map.get('A'));
        assertEquals(List.of("Banana","Blue"), map.get('B'));
    }

    // -------------------------
    // Exercise 10
    // -------------------------
    @Test
    void testFlatten() {
        List<List<Integer>> input = List.of(
                List.of(1,2),
                List.of(3),
                List.of(4,5)
        );

        List<Integer> result = ListUtils.flatten(input);
        assertEquals(List.of(1,2,3,4,5), result);
    }

}
