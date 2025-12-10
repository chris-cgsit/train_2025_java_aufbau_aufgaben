package at.cgsit.training.streams.level1.exercise06;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06_GroupProductsByCategoryTest {

    @Test
    void testGroupByCategory() {
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Mouse", 20.0, "Electronics"),
                new Product("Shirt", 30.0, "Fashion"),
                new Product("Pants", 50.0, "Fashion"),
                new Product("Ball", 10.0, "Sports")
        );

        Map<String, List<Product>> result =
                Exercise06_GroupProductsByCategory.groupByCategory(products);

        assertEquals(3, result.size());

        assertEquals(2, result.get("Electronics").size());
        assertEquals(2, result.get("Fashion").size());
        assertEquals(1, result.get("Sports").size());
    }

    @Test
    void testEmptyList() {
        Map<String, List<Product>> result =
                Exercise06_GroupProductsByCategory.groupByCategory(List.of());

        assertTrue(result.isEmpty());
    }
}
