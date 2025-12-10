package at.cgsit.training.streams.level1.exercise10;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Exercise10_MostExpensiveProductPerCategoryTest {

    @Test
    void testMostExpensiveProductPerCategory() {
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Mouse", 20.0, "Electronics"),
                new Product("Monitor", 350.0, "Electronics"),

                new Product("Shirt", 30.0, "Fashion"),
                new Product("Jacket", 150.0, "Fashion"),
                new Product("Shoes", 80.0, "Fashion"),

                new Product("Ball", 10.0, "Sports"),
                new Product("Bike", 500.0, "Sports")
        );

        Map<String, Product> result =
                Exercise10_MostExpensiveProductPerCategory.mostExpensivePerCategory(products);

        assertEquals(1200.0, result.get("Electronics").price());
        assertEquals(150.0, result.get("Fashion").price());
        assertEquals(500.0, result.get("Sports").price());
    }

    @Test
    void testSingleEntryPerCategory() {
        List<Product> products = List.of(
                new Product("ItemA", 10.0, "A"),
                new Product("ItemB", 20.0, "B")
        );

        Map<String, Product> result =
                Exercise10_MostExpensiveProductPerCategory.mostExpensivePerCategory(products);

        assertEquals(10.0, result.get("A").price());
        assertEquals(20.0, result.get("B").price());
    }
}
