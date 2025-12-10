package at.cgsit.training.functional.level3.exercise17;

import java.util.function.IntUnaryOperator;

/**
 * Aufgabe:
 * Erzeuge eine Funktion, die eine andere Funktion zurückgibt.
 *
 * Beispiel:
 * getMultiplier(3) → Funktion x -> x * 3
 */
public class Exercise17_HigherOrderFunction {

    /**
     * TODO:
     * Gib einen IntUnaryOperator zurück, der x mit 'factor' multipliziert.
     *
     * Beispiel:
     * getMultiplier(3).applyAsInt(5) → 15
     */
    public static IntUnaryOperator getMultiplier(int factor) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
