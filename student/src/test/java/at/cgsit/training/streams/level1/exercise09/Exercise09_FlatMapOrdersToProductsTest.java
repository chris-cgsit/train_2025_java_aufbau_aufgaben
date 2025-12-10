package at.cgsit.training.streams.level1.exercise09;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise09_FlatMapOrdersToProductsTest {

    @Test
    void testFlatMapExtract() {
        Order o1 = new Order(List.of(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Mouse", 20.0, "Electronics")
        ));

        Order o2 = new Order(List.of(
                new Product("Shirt", 30.0, "Fashion")
        ));

        Order o3 = new Order(List.of(
                new Product("Ball", 10.0, "Sports"),
                new Product("Shoes", 80.0, "Fashion")
        ));

        List<Order> orders = List.of(o1, o2, o3);

        List<Product> result =
                Exercise09_FlatMapOrdersToProducts.extractAllProducts(orders);

        assertEquals(5, result.size());
        assertTrue(result.contains(new Product("Laptop", 1200.0, "Electronics")));
        assertTrue(result.contains(new Product("Shirt", 30.0, "Fashion")));
        assertTrue(result.contains(new Product("Shoes", 80.0, "Fashion")));
    }

    @Test
    void testEmptyOrders() {
        List<Product> result =
                Exercise09_FlatMapOrdersToProducts.extractAllProducts(List.of());

        assertTrue(result.isEmpty());
    }

    @Test
    void testOrdersWithEmptyProductLists() {
        List<Order> orders = List.of(
                new Order(List.of()),
                new Order(List.of())
        );

        List<Product> result =
                Exercise09_FlatMapOrdersToProducts.extractAllProducts(orders);

        assertTrue(result.isEmpty());
    }
}
