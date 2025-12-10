package at.cgsit.training.functional.level1;

import java.util.Random;
import java.util.function.IntSupplier;

/**
 * Aufgabe:
 * Erzeuge einen IntSupplier, der Zufallszahlen im Bereich 1..10 liefert.
 * Verwende dabei die gegebene Random-Instanz.
 */
public class Exercise05_RandomSupplier {

    /**
     * TODO:
     * Erzeuge einen IntSupplier, der bei jedem Aufruf von getAsInt()
     * eine Zahl zwischen 1 und 10 (inklusive) liefert.
     *
     * Tipp: random.nextInt(10) liefert 0..9
     */
    public static IntSupplier createRandomSupplier(Random random) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
