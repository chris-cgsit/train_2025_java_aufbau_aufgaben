package at.cgsit.training;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathUtils {

    private static final Logger LOGGER = Logger.getLogger(MathUtils.class.getName());

    /**
     * aller positiven Integer-Werte in der Liste summiert zurückgibt
     * die summe der integer könnte long sein
     */
    public static int sumPositive(List<Integer> values) {

        if(values == null || values.isEmpty()) {
            return 0;
        }
        // klassisch
        // for( Integer value : values) {}

        LOGGER.setLevel(Level.FINE);

        // stream mit debug filter sysout
        IntSummaryStatistics stats = values.stream()
                .filter(value -> value > 0)
                .mapToInt(Integer::intValue)
                // .sum(); statt sum auch generell int statistics möglich
                .summaryStatistics();

        return (int)stats.getSum();

        /*
                        .peek(v -> {
                    if(v < 0 && LOGGER.isLoggable(Level.FINE) )
                        LOGGER.fine("dieser wert wird verworfen durch filter" + v);
                    System.out.println("SYSOUT: dieser wert wird verworfen durch filter "+ v);
                })
         */


    }
}
