package at.cgsit.training.functional.level1;

import java.util.List;
import java.util.function.Consumer;

/**
 * Aufgabe:
 * Erzeuge einen Consumer<String>, der den Namen in eine Log-Liste schreibt.
 * Format: "Name: <wert>"
 */
public class Exercise04_NamePrinter {

    /**
     * TODO:
     * Erzeuge einen Consumer, der bei accept(name) in log die
     * Zeichenkette "Name: " + name einfügt.
     */
    public static Consumer<String> createNamePrinter(List<String> log) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
