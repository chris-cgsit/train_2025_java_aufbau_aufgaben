package at.cgsit.training.functional.level3.exercise14;

@FunctionalInterface
public interface Merger<T> {
    T merge(T a, T b);
}
