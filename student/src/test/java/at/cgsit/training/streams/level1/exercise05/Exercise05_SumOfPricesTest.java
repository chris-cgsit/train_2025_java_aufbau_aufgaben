package at.cgsit.training.streams.level1.exercise05;

import at.cgsit.training.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05_SumOfPricesTest {

    @Test
    void testSumOfPrices() {
        List<Product> products = List.of(
                new Product("Laptop", 1000.0, "Electronics"),
                new Product("Mouse", 20.0, "Electronics"),
                new Product("Desk", 150.0, "Furniture")
        );

        double sum = Exercise05_SumOfPrices.sumPrices(products);

        assertEquals(1170.0, sum, 0.0001);
    }

    @Test
    void testEmptyList() {
        double sum = Exercise05_SumOfPrices.sumPrices(List.of());
        assertEquals(0.0, sum, 0.0001);
    }

    @Test
    void testSingleProduct() {
        double sum = Exercise05_SumOfPrices.sumPrices(
                List.of(new Product("Item", 42.5, "Misc"))
        );

        assertEquals(42.5, sum, 0.0001);
    }
}
