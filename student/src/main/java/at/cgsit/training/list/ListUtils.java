package at.cgsit.training.list;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
    // Exercise 05 : Alle Strings Elemente entfernen die NULL oder "" empty sind
    // Das Ergebnis ist eine return wert eine NEUE Liste
    // leerzeichen sollen nicht berücksichtig werden
    // -------------------------
    public static List<String> removeNullAndEmpty(List<String> input) {
        List<String> result = new ArrayList<>();

        for (String next : input) {
            // Apache Commons Lang hätte ein StringUtils.isBlank(s) dafür . einfacher
            if(next == null || next.trim().isEmpty())
                continue;
            result.add(next);
        }
        return result;
    }
    public static List<String> removeNullAndEmptyStream(List<String> input) {

        List<String> result = input.stream()
                .filter(Objects::nonNull)
                .filter(Predicate.not(s -> s.trim().isEmpty()))
                .collect(Collectors.toUnmodifiableList());

        return result;
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
