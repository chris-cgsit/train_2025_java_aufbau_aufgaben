package at.cgsit.training.streams.level1.exercise00Debug;

import java.util.List;

/**
 * Aufgabe:
 * Baue eine Stream-Pipeline mit mehreren Schritten:
 *
 * 1. Alle negativen Zahlen herausfiltern (nur >= 0 behalten)
 * 2. Alle verbleibenden Zahlen verdoppeln
 * 3. Ergebnis aufsteigend sortieren
 *
 * Zusätzlich:
 * - Verwende peek(), um Debug-Infos in debugLog zu schreiben.
 *
 * Vorschlag für Log-Nachrichten:
 *  - am Anfang:           "start: " + n
 *  - nach dem Filter:     "after filter: " + n
 *  - nach dem Mapping:    "after map: " + n
 *  - nach dem Sort:       "after sort: " + n
 */
public class ExerciseDebug_NumbersPipeline {

    /**
     * TODO:
     * Implementiere die beschriebene Pipeline mit Streams und peek().
     *
     * Hinweis:
     * - Verwende input.stream()
     * - Jeder peek-Schritt soll in die debugLog-Liste schreiben
     */
    public static List<Integer> processNumbers(List<Integer> input, List<String> debugLog) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
