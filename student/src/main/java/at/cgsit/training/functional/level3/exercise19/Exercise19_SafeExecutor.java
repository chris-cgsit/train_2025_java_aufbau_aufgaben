package at.cgsit.training.functional.level3.exercise19;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Aufgabe:
 * Führe einen Supplier aus. Falls er erfolgreich einen Wert liefert,
 * gib Optional.of(value) zurück.
 *
 * Falls beim Ausführen eine Exception fliegt,
 * gib Optional.empty() zurück.
 */
public class Exercise19_SafeExecutor {

    /**
     * TODO:
     * - führe supplier.get() aus
     * - fange alle Exceptions ab
     * - bei Erfolg: return Optional.of(result)
     * - bei Fehler: return Optional.empty()
     */
    public static <T> Optional<T> executeSafely(Supplier<T> supplier) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
