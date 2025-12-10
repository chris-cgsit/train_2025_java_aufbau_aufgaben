package at.cgsit.training.functional.level3.exercise20;

import java.util.function.Supplier;

/**
 * Aufgabe:
 * Miss die Ausführungszeit einer Supplier-Operation.
 *
 * Vorgehen:
 * - Zeit vor der Ausführung mit System.nanoTime() speichern
 * - Supplier ausführen
 * - Zeit nach der Ausführung nehmen
 * - Dauer berechnen
 * - BenchmarkResult<T> zurückgeben
 */
public class Exercise20_BenchmarkRunner {

    /**
     * TODO:
     * Miss die Ausführungszeit der Operation.
     */
    public static <T> BenchmarkResult<T> benchmark(Supplier<T> operation) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
