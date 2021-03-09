package algorithms.tests.arrays;

import algorithms.arrays.TwoSum;
import algorithms.arrays.WaterArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterAreaTest {

    @Test
    public void WaterAreaTestNormalSolution(){

        int[] input = {1,8,6,2,9,4};

        String expected = "1 4";

        assertEquals(expected, WaterArea.findLargestArea(input));
    }

    @Test
    public void WaterAreaTestEmptyArrayReturnsNull(){

        int[] input = {};

        String expected = null;

        assertEquals(expected, WaterArea.findLargestArea(input));
    }

    @Test
    public void WaterAreaTestArrayOfOneReturnsNull(){

        int[] input = {7};

        String expected = null;

        assertEquals(expected, WaterArea.findLargestArea(input));
    }

    @Test
    public void WaterAreaTestAdjacentLargeIndices(){

        int[] input = {1,8,6,2,50,60};

        String expected = "4 5";

        assertEquals(expected, WaterArea.findLargestArea(input));
    }
}
