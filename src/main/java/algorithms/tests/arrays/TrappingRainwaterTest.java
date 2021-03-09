package algorithms.tests.arrays;

import algorithms.arrays.TrappingRainwater;
import algorithms.arrays.WaterArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainwaterTest {

    @Test
    public void TrappingRainwaterNormalSolution(){

        int[] input = {0,1,0,2,1,0,3,1,0,1,2};

        Integer expected = 8;

        assertEquals(expected, TrappingRainwater.findTrappedWater(input));
    }

    @Test
    public void TrappingRainwaterEmptyArray(){

        int[] input = {};

        Integer expected = 0;

        assertEquals(expected, TrappingRainwater.findTrappedWater(input));
    }

    @Test
    public void TrappingRainwaterOneValue(){

        int[] input = {3};

        Integer expected = 0;

        assertEquals(expected, TrappingRainwater.findTrappedWater(input));
    }

    @Test
    public void TrappingRainwaterNoSeparation(){

        int[] input = {3,4,3};

        Integer expected = 0;

        assertEquals(expected, TrappingRainwater.findTrappedWater(input));
    }


}
