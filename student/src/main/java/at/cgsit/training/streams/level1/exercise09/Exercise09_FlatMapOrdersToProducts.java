package at.cgsit.training.streams.level1.exercise09;

import at.cgsit.training.model.Product;

import java.util.List;

/**
 * Aufgabe:
 * Jede Order hat eine Liste von Produkten.
 * Sammle alle Produkte aus ALLEN Orders in einer gemeinsamen Liste.
 *
 * Tipp: flatMap(order -> order.products().stream())
 */
public class Exercise09_FlatMapOrdersToProducts {

    /**
     * TODO:
     * Verwende flatMap(), um:
     *  - die Produktlisten der Orders "aufzuflachen"
     *  - eine Gesamtliste aller Produkte zurückzugeben
     */
    public static List<Product> extractAllProducts(List<Order> orders) {
        throw new UnsupportedOperationException("TODO - implement me");
    }
}
