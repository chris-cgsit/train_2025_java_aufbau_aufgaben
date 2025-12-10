package at.cgsit.training.map;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapUtilsTest {

    @Test
    void testCountWordFrequency() {
        List<String> words = List.of("a","b","a","c","b","a");
        var result = MapUtils.countWordFrequency(words);
        assertEquals(3, result.get("a"));
        assertEquals(2, result.get("b"));
        assertEquals(1, result.get("c"));
    }

    @Test
    void testInvertMap() {
        Map<String,String> input = Map.of("a","1","b","2");
        var inverted = MapUtils.invertMap(input);
        assertEquals("a", inverted.get("1"));
        assertEquals("b", inverted.get("2"));
    }

    @Test
    void testMergeMaps() {
        Map<String,Integer> a = Map.of("x",1,"y",2);
        Map<String,Integer> b = Map.of("y",3,"z",4);

        var merged = MapUtils.mergeMaps(a,b);

        assertEquals(1, merged.get("x"));
        assertEquals(5, merged.get("y"));
        assertEquals(4, merged.get("z"));
    }

    @Test
    void testFindMaxValueEntry() {
        Map<String,Integer> map = Map.of("a",10,"b",5,"c",20);
        var entry = MapUtils.findMaxValueEntry(map);
        assertEquals("c", entry.getKey());
        assertEquals(20, entry.getValue());
    }

    @Test
    void testGroupByLength() {
        List<String> words = List.of("a", "to", "tea", "be");
        var grouped = MapUtils.groupByLength(words);

        assertEquals(List.of("a"), grouped.get(1));
        assertTrue(grouped.get(2).contains("to"));
        assertTrue(grouped.get(2).contains("be"));
        assertEquals(List.of("tea"), grouped.get(3));
    }

    @Test
    void testMapValuesToUppercase() {
        Map<String,String> m = Map.of("a","hello","b","world");
        var result = MapUtils.mapValuesToUppercase(m);

        assertEquals("HELLO", result.get("a"));
        assertEquals("WORLD", result.get("b"));
    }

    @Test
    void testSumValuesByPrefix() {
        Map<String,Integer> m = Map.of("A1",10,"A2",20,"B1",100);
        assertEquals(30, MapUtils.sumValuesByPrefix(m,"A"));
    }

    @Test
    void testNestedMapCount() {
        Map<String, Map<String,Integer>> nested = new HashMap<>();
        nested.put("x", Map.of("a",1,"b",2));
        nested.put("y", Map.of("c",3));

        assertEquals(6, MapUtils.nestedMapCount(nested));
    }

    @Test
    void testRemoveAllWithValue() {
        Map<String,Integer> m = new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",1);

        MapUtils.removeAllWithValue(m,1);

        assertFalse(m.containsKey("a"));
        assertFalse(m.containsKey("c"));
        assertTrue(m.containsKey("b"));
    }

    @Test
    void testSortByValueAscending() {
        Map<String,Integer> m = new HashMap<>();
        m.put("x", 5);
        m.put("y", 2);
        m.put("z", 7);

        var sorted = MapUtils.sortByValueAscending(m);

        List<Integer> values = new ArrayList<>(sorted.values());
        assertEquals(List.of(2,5,7), values);
    }
}
