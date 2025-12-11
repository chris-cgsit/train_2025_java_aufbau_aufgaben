package at.cgsit.training.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
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
    // Exercise 02 – Resize array grösser machen und werte übernehme wenn grösser
    // oder einen fehler werfen da
    // ---------------------------------------------------------
    public static int[] resize(int[] input, int newSize) {
        if (input == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }
        if( newSize < input.length) {
            // hier würden daten verloren gehen ..
            // da int native kein NULL hat .. wissen wir nicht ob es dort leer wäre.
            throw new IllegalArgumentException("neue grösse darf nicht kleiner sein als bestehend");
        }

        int copyCounter = 0;
        // wenn newSize grösser ist können wir bis lenght koperen
        // wenn new size kleiner ist können wir nur bis new size kopieren
        // da nicht mehr platz ist im ziel
        if(newSize > input.length) {
            copyCounter = input.length;
        } else {
            copyCounter = newSize;
        }
        // das minimum kann ich immer kopieren, denn wenn new size kleiner ist als input kopieren wir nur nuew size
        // und der rest geht verloren onst koperen wir die length und die restlichen slot bleiben auf 0
        int lengthToCopy = Math.min(input.length, newSize);

        // wird mit 0 initialisert
        int[] result = new int[newSize];

        // jetzt kopieren der werte aus dem alten array in das neue
        for (int i = 0; i < copyCounter ; i++) {
            result[i] = input[i];
        }

        return result;
    }

    // ---------------------------------------------------------
    // Exercise 03 – Min, Max, Average of array
    // ---------------------------------------------------------
    public static Stats calculateStats(double[] input) {

        if (input == null || input.length == 0) {
            return new Stats(0, 0, 0);
        }

        DoubleSummaryStatistics doubleStats = Arrays.stream(input).summaryStatistics();

        return new Stats(doubleStats.getMin(), doubleStats.getMax(), doubleStats.getAverage());
    }

    public static Stats calculateStatsKlassisch(double[] input) {
        if (input == null || input.length == 0) {
            return new Stats(0, 0, 0);
        }

        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY; // negativ damit ist es maximal klein beim ausgang
        double sum = 0.0;

        for (double value : input) {
            if(value > max)  max = value;
            if(value < min)  min = value;
            sum += value;
        }

        double average = sum / input.length;

        double round = Math.round(average * 100.0) / 100.0;
        System.out.printf("math rounded: [%s]", round);

        BigDecimal bigDecimal = BigDecimal.valueOf(average);
        double roundingResult = bigDecimal.setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        return new Stats(min, max, average);
    }


        // Für Exercise 03
    public record Stats(double min, double max, double avg) {}
}
