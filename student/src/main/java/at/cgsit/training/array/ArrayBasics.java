package at.cgsit.training.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayBasics {

    // ---------------------------------------------------------
    // Exercise 01 – Sum of array element values
    // ---------------------------------------------------------
    public static int sum(int[] input) {

        // 1 for i ..
        // for i to length .. wäre möglich aber sinnlos
        // int length = input.length;

        // 2. iterator .. aber dann bäuchten wir collection

        // 3. simple loop
        int summe = 0;
        for (int value : input) {
            summe += value;
        }
        // 4. stream siehe sumStream
        return summe;
    }

    private static int sumStream(int[] input) {
        return Arrays.stream(input).sum();
    }


    // ---------------------------------------------------------
    // Exercise 02 – Resize array
    // ---------------------------------------------------------
    public static int[] resize(int[] input, int newSize) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // ---------------------------------------------------------
    // Exercise 03 – Min, Max, Average of array
    // ---------------------------------------------------------
    public static Stats calculateStats(double[] input) {
        throw new UnsupportedOperationException("TODO - implement me");
    }

    // Für Exercise 03
    public record Stats(double min, double max, double avg) {}
}
