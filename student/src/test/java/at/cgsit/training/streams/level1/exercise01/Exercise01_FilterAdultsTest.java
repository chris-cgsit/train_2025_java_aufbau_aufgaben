package at.cgsit.training.streams.level1.exercise01;

import at.cgsit.training.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise01_FilterAdultsTest {

    @Test
    void testAdultFiltering() {
        List<Person> persons = List.of(
                new Person("Chris", 45),
                new Person("Alex", 17),
                new Person("Susi", 22),
                new Person("Tom", 15)
        );

        List<Person> result = Exercise01_FilterAdults.filterAdults(persons);

        assertEquals(2, result.size());
        assertTrue(result.contains(new Person("Chris", 45)));
        assertTrue(result.contains(new Person("Susi", 22)));
    }

    @Test
    void testEmptyList() {
        List<Person> result = Exercise01_FilterAdults.filterAdults(List.of());
        assertEquals(0, result.size());
    }
}
