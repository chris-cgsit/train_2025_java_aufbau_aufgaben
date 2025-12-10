package at.cgsit.training.functional.level3.exercise13;

/**
 * Functional interface for validating a value.
 */
@FunctionalInterface
public interface Validator<T> {
    boolean isValid(T value);
}
