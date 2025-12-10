package at.cgsit.training.functional.level2;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Aufgabe:
 * Finde das erste Element in einer Liste, das ein Predicate erfüllt.
 */
public class Exercise08_FirstMatchFinder {

    /**
     * TODO:
     * Durchlaufe die Liste in Reihenfolge und gib das
     * erste Element zurück, für das predicate.test(value) == true ist.
     * Falls keines passt: Optional.empty().
     */
    public static Optional<String> findFirst(List<String> input, Predicate<String> predicate) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
