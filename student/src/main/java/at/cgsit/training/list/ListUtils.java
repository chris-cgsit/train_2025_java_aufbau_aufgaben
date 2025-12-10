package at.cgsit.training.list;

import java.util.*;

public class ListUtils {

    // -------------------------
    // Exercise 01
    // -------------------------
    public static List<Integer> removeDuplicatesPreserveOrder(List<Integer> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 02
    // -------------------------
    public static SplitResult splitEvenAndOdd(List<Integer> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 03
    // -------------------------
    public static List<String> rotateRight(List<String> input, int k) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 04
    // -------------------------
    public static Stats calculateStats(List<Double> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 05
    // -------------------------
    public static List<String> removeNullAndEmpty(List<String> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 06
    // -------------------------
    public static List<String> insertSeparatorAfterEach(List<String> input, String separator) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 07
    // -------------------------
    public static List<Integer> reverseList(List<Integer> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 08
    // -------------------------
    public static List<Pair> findPairsWithSum(List<Integer> input, int target) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 09
    // -------------------------
    public static Map<Character, List<String>> groupByFirstLetter(List<String> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // -------------------------
    // Exercise 10
    // -------------------------
    public static List<Integer> flatten(List<List<Integer>> input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ----------------------------------
    // Hilfs-Datentypen für mehrere Tasks
    // ----------------------------------

    public record SplitResult(List<Integer> even, List<Integer> odd) {}
    public record Stats(double min, double max, double avg) {}
    public record Pair(int a, int b) {}
}
