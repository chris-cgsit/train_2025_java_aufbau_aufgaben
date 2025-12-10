package at.cgsit.training.streams.level1.exercise01;

import at.cgsit.training.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Aufgabe:
 * Filtere alle Personen heraus, die mindestens 18 Jahre alt sind.
 *
 * Rückgabe: Liste nur mit Erwachsenen.
 */
public class Exercise01_FilterAdults {

    /**
     * TODO:
     * Verwende einen Stream, um alle Personen zu
     * filtern, deren age >= 18 ist.
     * und returniere eine neue also die gefilterte liste der erwachsenen Personen
     */
    public static List<Person> filterAdults(List<Person> persons) {
        if(persons == null || persons.isEmpty()){
            // unveränderbar .. sonst new ArrayList
            return List.of();
        }

        return persons.stream()
                .filter(p -> p.age() >= 18)
                .toList();
    }
}
