package at.cgsit.training.streams.level1.exercise07;

import at.cgsit.training.model.Person;

import java.util.List;
import java.util.Map;

/**
 * Aufgabe:
 * Partitioniere Personen in zwei Gruppen:
 *  - Erwachsene (age >= 18)
 *  - Minderjährige (age < 18)
 *
 * Verwende: Collectors.partitioningBy()
 */
public class Exercise07_PartitionAdults {

    /**
     * TODO:
     * Gib eine Map<Boolean, List<Person>> zurück.
     *
     * true  -> alle Erwachsenen
     * false -> alle Minderjährigen
     */
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> persons) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
