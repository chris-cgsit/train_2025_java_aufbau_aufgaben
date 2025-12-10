package at.cgsit.training.streams.level1.exercise09;

import at.cgsit.training.model.Product;

import java.util.List;

/**
 * Einfache Order-Klasse für die Übung.
 */
public record Order(List<Product> products) {}
