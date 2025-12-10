package at.cgsit.training.streams.level1.exercise08;

import at.cgsit.training.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise08_AverageAgeTest {

    @Test
    void testAverageAge() {
        List<Person> persons = List.of(
                new Person("Chris", 44),
                new Person("Alex", 18),
                new Person("Susi", 22)
        );

        double avg = Exercise08_AverageAge.averageAge(persons);

        // Durchschnitt = (44 + 18 + 22) / 3 = 28.0
        assertEquals(28.0, avg, 0.0001);
    }

    @Test
    void testSinglePerson() {
        double avg = Exercise08_AverageAge.averageAge(
                List.of(new Person("Tom", 40))
        );

        assertEquals(40.0, avg, 0.0001);
    }

    @Test
    void testEmptyList() {
        // averagingInt gibt bei leerem Stream 0.0 zurück
        double avg = Exercise08_AverageAge.averageAge(List.of());

        assertEquals(0.0, avg, 0.0001);
    }
}
