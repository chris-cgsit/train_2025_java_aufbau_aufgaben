package at.cgsit.training.functional.level3.exercise12;

/**
 * Generic functional interface to convert a value of type T into type U.
 */
@FunctionalInterface
public interface Converter<T, U> {
    U convert(T value);
}
