package at.cgsit.training.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetBasics {

    /**
     * Übung:
     * 1. Führe den Test aus – warum enthält das Set zwei Elemente?
     * 2. Implementiere equals() und hashCode() so,
     *    dass zwei Personen als gleich gelten,
     *    wenn name UND age gleich sind.
     */
    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // TODO: equals() implementieren
        // TODO: hashCode() implementieren

        public String name() { return name; }
        public int age() { return age; }
    }

    /**
     * Diese Methode legt dieselbe Person zweimal in ein Set.
     * Mit korrekter equals/hashCode-Implementierung
     * darf das Set nur ein Element enthalten.
     */
    public static Set<Person> createSetWithDuplicates() {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("Anna", 20);
        Person p2 = new Person("Anna", 20);

        set.add(p1);
        set.add(p2);

        return set;
    }
}
