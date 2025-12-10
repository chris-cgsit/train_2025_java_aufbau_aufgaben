package at.cgsit.training.functional.level3.exercise16;

/**
 * A single transformation step for an Integer value.
 */
@FunctionalInterface
public interface PipelineStep {
    int apply(int input);
}
