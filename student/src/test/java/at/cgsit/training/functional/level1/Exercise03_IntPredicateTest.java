package at.cgsit.training.functional.level1;

import org.junit.jupiter.api.Test;

import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03_IntPredicateTest {

    @Test
    void testIsPositivePredicate() {
        IntPredicate p = Exercise03_IntPredicate.createIsPositivePredicate();

        assertTrue(p.test(1));
        assertFalse(p.test(0));
        assertFalse(p.test(-1));
    }
}
