package at.cgsit.training.streams.level1.exercise04;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04_DistinctCategoriesTest {

    @Test
    void testDistinctCategories() {
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Mouse", 15.0, "Electronics"),
                new Product("Shoes", 75.0, "Fashion"),
                new Product("Shirt", 30.0, "Fashion"),
                new Product("Bike", 500.0, "Sports")
        );

        List<String> result =
                Exercise04_DistinctCategories.getDistinctCategories(products);

        assertEquals(List.of("Electronics", "Fashion", "Sports"), result);
    }

    @Test
    void testEmptyList() {
        List<String> result =
                Exercise04_DistinctCategories.getDistinctCategories(List.of());

        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleCategory() {
        List<Product> products = List.of(
                new Product("Item1", 10.0, "A"),
                new Product("Item2", 20.0, "A")
        );

        List<String> result =
                Exercise04_DistinctCategories.getDistinctCategories(products);

        assertEquals(List.of("A"), result);
    }
}
