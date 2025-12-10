package at.cgsit.training.set;

import java.util.*;

/**
 * ============================================================
 *        SET – Wichtige Mengenoperationen (Deutsch ↔ Englisch)
 * ============================================================
 *
 * Dieses Kapitel verwendet Begriffe aus der Mengenlehre
 * (Mathematik & Informatik). Die folgende Tabelle erklärt alle
 * vorkommenden Fachausdrücke kurz und eindeutig für Schüler.
 *
 * ------------------------------------------------------------
 *  ENGLISCH                  | DEUTSCH
 * ------------------------------------------------------------
 *  Set                      | Menge
 *  Element                  | Element / Wert
 *  Intersection             | Schnittmenge (A ∩ B)
 *  Union                    | Vereinigungsmenge (A ∪ B)
 *  Difference               | Differenzmenge (A - B)
 *  Symmetric Difference     | Symmetrische Differenz
 *                           |   Nur Elemente, die NICHT in beiden Mengen sind
 *
 *  Disjoint                 | Disjunkt
 *                           |   Zwei Mengen haben KEINE gemeinsamen Elemente
 *
 *  Subset                   | Teilmenge (A ⊆ B)
 *                           |   Alle Elemente von A kommen auch in B vor
 *
 *  Unique Elements          | Eindeutige Elemente / keine Duplikate
 *
 *  Frequency Map            | Häufigkeits-Tabelle / Zähl-Map
 *                           |   z. B. Wort → Anzahl
 *
 *  Category Mapping         | Einordnung / Zuordnung in Kategorien
 *
 * ------------------------------------------------------------
 *
 * Mathematische Schreibweise:
 *
 *   A ∩ B   → Elemente, die in A UND in B sind
 *   A ∪ B   → Elemente, die in A ODER in B sind (alle)
 *   A - B   → Elemente, die in A, aber NICHT in B sind
 *   A ⊆ B   → A ist eine Teilmenge von B
 *
 * ============================================================
 * Diese Tabelle eignet sich perfekt für Schüler, um den
 * Zusammenhang zwischen Math-Begriffen und Programmierung zu
 * verstehen.
 * ============================================================
 *
 */
public class SetUtils {

    // ---------------------------------------------------------
    // Exercise 01 – Intersection (A ∩ B)
    // ---------------------------------------------------------
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 02 – Union (A ∪ B)
    // ---------------------------------------------------------
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 03 – Difference (A - B)
    // ---------------------------------------------------------
    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 04 – Symmetric Difference
    // ---------------------------------------------------------
    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 05 – Are sets disjoint?
    // ---------------------------------------------------------
    public static <T> boolean areDisjoint(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 06 – A ⊆ B ?
    // ---------------------------------------------------------
    public static <T> boolean isSubset(Set<T> a, Set<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 07 – Are all elements unique?
    // ---------------------------------------------------------
    public static <T> boolean allElementsUnique(List<T> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 08 – Frequency map from List
    // ---------------------------------------------------------
    public static Map<String, Integer> frequencyMap(List<String> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 09 – Categorize words by set membership
    // ---------------------------------------------------------
    public static Map<String, String> categorizeWords(
            List<String> words,
            Set<String> fruits,
            Set<String> animals) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 10 – Compare lists ignoring duplicates
    // ---------------------------------------------------------
    public static <T> boolean haveSameElementsIgnoringDuplicates(
            List<T> a,
            List<T> b) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
