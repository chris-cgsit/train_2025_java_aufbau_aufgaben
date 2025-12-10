package at.cgsit.training.streams.level1.exercise10;

import at.cgsit.training.model.Product;

import java.util.List;
import java.util.Map;

/**
 * Aufgabe:
 * Ermittle für jede Kategorie das teuerste Produkt.
 *
 * Tipp:
 *   groupingBy(category, maxBy(...))
 *
 * Ziel:
 *   Map<String, Product>   // Kategorie -> teuerstes Produkt
 */
public class Exercise10_MostExpensiveProductPerCategory {

    /**
     * TODO:
     * Verwende groupingBy() und maxBy(), um für jede Kategorie
     * das teuerste Produkt zu berechnen.
     */
    public static Map<String, Product> mostExpensivePerCategory(List<Product> products) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
