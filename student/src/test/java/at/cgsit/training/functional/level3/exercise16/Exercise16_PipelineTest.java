package at.cgsit.training.functional.level3.exercise16;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise16_PipelineTest {

    @Test
    void testPipelineSimple() {
        List<PipelineStep> steps = List.of(
                x -> x * 2,   // 5 → 10
                x -> x - 3    // 10 → 7
        );

        int result = Exercise16_Pipeline.applyPipeline(5, steps);

        assertEquals(7, result);
    }

    @Test
    void testPipelineMultipleSteps() {
        List<PipelineStep> steps = List.of(
                x -> x + 1,   // 3 → 4
                x -> x * 3,   // 4 → 12
                x -> x - 2    // 12 → 10
        );

        int result = Exercise16_Pipeline.applyPipeline(3, steps);

        assertEquals(10, result);
    }

    @Test
    void testPipelineNoSteps() {
        int result = Exercise16_Pipeline.applyPipeline(42, List.of());

        assertEquals(42, result);
    }
}
