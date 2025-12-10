package at.cgsit.training.streams.level1.exercise03;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise03_SortProductsByPriceTest {

    @Test
    void testSorting() {
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Mouse", 15.0, "Electronics"),
                new Product("Desk", 200.0, "Furniture")
        );

        List<Product> result =
                Exercise03_SortProductsByPrice.sortByPrice(products);

        assertEquals("Mouse", result.get(0).name());
        assertEquals("Desk", result.get(1).name());
        assertEquals("Laptop", result.get(2).name());
    }

    @Test
    void testEmptyList() {
        List<Product> result =
                Exercise03_SortProductsByPrice.sortByPrice(List.of());

        assertTrue(result.isEmpty());
    }

    @Test
    void testAlreadySorted() {
        List<Product> products = List.of(
                new Product("A", 1.0, "X"),
                new Product("B", 2.0, "X"),
                new Product("C", 3.0, "X")
        );

        List<Product> result =
                Exercise03_SortProductsByPrice.sortByPrice(products);

        assertEquals(products, result);
    }
}
