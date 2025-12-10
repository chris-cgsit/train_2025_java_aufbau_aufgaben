package at.cgsit.training.functional.level3.exercise18;

import java.util.List;
import java.util.function.IntUnaryOperator;

/**
 * Aufgabe:
 * Wende eine Liste von IntUnaryOperator-Schritten nacheinander
 * auf einen Startwert an.
 *
 * Beispiel:
 * steps: [ x -> x + 1, x -> x * 2 ]
 * input: 3
 * Ergebnis: ((3 + 1) * 2) = 8
 */
public class Exercise18_OperationChain {

    /**
     * TODO:
     * Beginne mit 'input' und wende jeden Schritt in der Liste
     * nacheinander auf den aktuellen Wert an.
     *
     * Tipp: acc = op.applyAsInt(acc)
     */
    public static int applyOperations(int input, List<IntUnaryOperator> steps) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
