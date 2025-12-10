package at.cgsit.training.streams.level1.exercise07;

import at.cgsit.training.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07_PartitionAdultsTest {

    @Test
    void testPartitionAdults() {
        List<Person> persons = List.of(
                new Person("Chris", 45),
                new Person("Alex", 17),
                new Person("Susi", 22),
                new Person("Tom", 12)
        );

        Map<Boolean, List<Person>> result =
                Exercise07_PartitionAdults.partitionAdults(persons);

        // Erwachsene
        assertEquals(2, result.get(true).size());
        assertTrue(result.get(true).contains(new Person("Chris", 45)));
        assertTrue(result.get(true).contains(new Person("Susi", 22)));

        // Minderjährige
        assertEquals(2, result.get(false).size());
        assertTrue(result.get(false).contains(new Person("Alex", 17)));
        assertTrue(result.get(false).contains(new Person("Tom", 12)));
    }

    @Test
    void testEmptyList() {
        Map<Boolean, List<Person>> result =
                Exercise07_PartitionAdults.partitionAdults(List.of());

        assertTrue(result.get(true).isEmpty());
        assertTrue(result.get(false).isEmpty());
    }
}
