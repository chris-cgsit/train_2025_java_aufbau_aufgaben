package at.cgsit.training.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetBasicsTest {

    @Test
    void testPersonEqualsHashCodeNotImplemented() {
        // Student-Version:
        SetBasics.Person p1 = new SetBasics.Person("Anna", 20);
        SetBasics.Person p2 = new SetBasics.Person("Anna", 20);

        assertNotEquals(p1, p2,
                "Ohne equals()-Implementierung dürfen p1 und p2 nicht gleich sein.");
    }

    @Test
    void testSetContainsTwoElementsWithoutEqualsHashCode() {
        Set<SetBasics.Person> set = SetBasics.createSetWithDuplicates();

        assertEquals(2, set.size(),
                "Ohne korrektes equals/hashCode enthält das Set zwei Elemente.");
    }

    @Test
    void testCorrectEqualsAndHashCode() {
        SetBasics.Person p1 = new SetBasics.Person("Anna", 20);
        SetBasics.Person p2 = new SetBasics.Person("Anna", 20);

        assertEquals(p1, p2,
                "Mit korrektem equals() sollen beide Personen gleich sein.");

        assertEquals(p1.hashCode(), p2.hashCode(),
                "Mit korrektem hashCode() sollen beide Personen denselben Hashwert haben.");
    }

    @Test
    void testSetContainsOnlyOneElementWithCorrectImplementation() {
        Set<SetBasics.Person> set = SetBasics.createSetWithDuplicates();

        assertEquals(1, set.size(),
                "Mit korrekt implementiertem equals/hashCode darf das Set nur EIN Element enthalten.");
    }
}
