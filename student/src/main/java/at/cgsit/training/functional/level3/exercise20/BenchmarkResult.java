package at.cgsit.training.functional.level3.exercise20;

/**
 * Ergebnis eines Benchmarks:
 * - result: Rückgabewert der Operation
 * - durationNanos: Dauer der Ausführung in Nanosekunden
 */
public record BenchmarkResult<T>(T result, long durationNanos) {}
