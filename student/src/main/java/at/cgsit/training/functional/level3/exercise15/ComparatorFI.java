package at.cgsit.training.functional.level3.exercise15;

@FunctionalInterface
public interface ComparatorFI<T> {
    int compare(T a, T b);
}
