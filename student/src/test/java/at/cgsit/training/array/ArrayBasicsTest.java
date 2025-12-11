package at.cgsit.training.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBasicsTest {

    @Test
    void testSum() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(10, ArrayBasics.sum(nums));
    }


    @Test
    void testResizeGrow() {
        int[] nums = {1, 2, 3};
        int[] resized = ArrayBasics.resize(nums, 5);

        assertArrayEquals(new int[]{1,2,3,0,0}, resized);
    }

    @Test
    void testResizeShrink() {
        int[] nums = {1, 2, 3, 4};
        IllegalArgumentException ex =
        assertThrows(IllegalArgumentException.class, () -> {
                    ArrayBasics.resize(nums, 2);
                });

        assertTrue(ex.getMessage().contains("neue grösse darf nicht kleiner sein als bestehend"));
        // assertArrayEquals(new int[]{1,2}, resized);
    }

    @Test
    void testCalculateStats() {
        double[] nums = {10.0, 20.0, 30.0};

        ArrayBasics.Stats stats = ArrayBasics.calculateStats(nums);

        assertEquals(10.0, stats.min(), 0.0001);
        assertEquals(30.0, stats.max(), 0.0001);
        assertEquals(20.0, stats.avg(), 0.0001);
    }

    @Test
    void testCalculateStatsKlassik() {
        double[] nums = {10.0, 20.0, 30.0};

        ArrayBasics.Stats stats = ArrayBasics.calculateStatsKlassisch(nums);

        assertEquals(10.0, stats.min(), 0.0001);
        assertEquals(30.0, stats.max(), 0.0001);
        assertEquals(20.0, stats.avg(), 0.0001);
    }


}
