package at.cgsit.training.streams.level1.exercise00Debug;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseDebug_NumbersPipelineTest {

    @Test
    void testProcessNumbersWithDebugLog() {
        List<Integer> input = List.of(3, -1, 0, 5);
        List<String> debugLog = new ArrayList<>();

        List<Integer> result =
                ExerciseDebug_NumbersPipeline.processNumbers(input, debugLog);

        // Ergebnis prüfen:
        // input: 3, -1, 0, 5
        // filter (>=0): 3, 0, 5
        // map (*2): 6, 0, 10
        // sort: 0, 6, 10
        assertEquals(List.of(0, 6, 10), result);

        // Debug-Log prüfen (nicht jedes Detail, aber Grundstruktur)
        assertTrue(debugLog.contains("start: 3"));
        assertTrue(debugLog.contains("start: -1"));
        assertTrue(debugLog.contains("start: 0"));
        assertTrue(debugLog.contains("start: 5"));

        // nach Filter sollten nur noch >= 0 vorkommen
        assertTrue(debugLog.contains("after filter: 3"));
        assertTrue(debugLog.contains("after filter: 0"));
        assertTrue(debugLog.contains("after filter: 5"));
        // -1 sollte NICHT im "after filter" auftauchen
        assertFalse(debugLog.contains("after filter: -1"));

        // nach Map: Werte verdoppelt
        assertTrue(debugLog.contains("after map: 6"));
        assertTrue(debugLog.contains("after map: 0"));
        assertTrue(debugLog.contains("after map: 10"));
    }
}
