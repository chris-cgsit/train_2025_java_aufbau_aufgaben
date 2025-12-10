package at.cgsit.training.set;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetSortingTest {

    @Test
    void testSortedListFromSet() {
        Set<Integer> input = Set.of(5, 1, 4, 2, 3);
        List<Integer> sorted = SetSorting.sortedListFromSet(input);

        assertEquals(List.of(1,2,3,4,5), sorted);
    }

    @Test
    void testToSortedSet() {
        Set<String> input = Set.of("banana", "apple", "pear");
        Set<String> sorted = SetSorting.toSortedSet(input);

        assertEquals(new TreeSet<>(List.of("apple", "banana", "pear")), sorted);
    }

    @Test
    void testSortPersons() {
        SetSorting.Person p1 = new SetSorting.Person("Anna", 22);
        SetSorting.Person p2 = new SetSorting.Person("Ben", 20);
        SetSorting.Person p3 = new SetSorting.Person("Clara", 20);
        SetSorting.Person p4 = new SetSorting.Person("Daniel", 25);

        Set<SetSorting.Person> input = Set.of(p1, p2, p3, p4);

        Set<SetSorting.Person> sorted = SetSorting.sortPersons(input);

        List<SetSorting.Person> expected = List.of(
                p2,   // age 20, name Ben
                p3,   // age 20, name Clara
                p1,   // age 22
                p4    // age 25
        );

        assertEquals(expected, new ArrayList<>(sorted));
    }
}
