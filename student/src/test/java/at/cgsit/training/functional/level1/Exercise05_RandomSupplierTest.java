package at.cgsit.training.functional.level1;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.function.IntSupplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise05_RandomSupplierTest {

    @Test
    void testRandomSupplierDeterministic() {
        Random random = new Random(12345);
        IntSupplier supplier =
                Exercise05_RandomSupplier.createRandomSupplier(random);

        int v1 = supplier.getAsInt();
        int v2 = supplier.getAsInt();
        int v3 = supplier.getAsInt();

        // deterministisch wegen Seed:
        assertEquals(4, v1);
        assertEquals(9, v2);
        assertEquals(2, v3);

        assertTrue(v1 >= 1 && v1 <= 10);
        assertTrue(v2 >= 1 && v2 <= 10);
        assertTrue(v3 >= 1 && v3 <= 10);
    }
}
