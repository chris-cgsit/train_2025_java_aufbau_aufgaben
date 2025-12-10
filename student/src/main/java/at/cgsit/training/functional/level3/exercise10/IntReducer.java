package at.cgsit.training.functional.level3.exercise10;

/**
 * Funktionales Interface für eine Reduktion.
 */
@FunctionalInterface
public interface IntReducer {

    int apply(int acc, int value);
}
