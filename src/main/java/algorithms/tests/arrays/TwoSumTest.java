package algorithms.tests.arrays;

import algorithms.arrays.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void twoNumbersTestWithSolution(){

        int[] input = {1,3,7,9,2};
        int target = 11;

        String expected = "3 4";


        assertEquals(expected, TwoSum.twoNumbersSumToTarget(input, target));

    }

    @Test
    public void twoNumbersTestNoSolution(){

        int[] input = {1,3,7,9,0};
        int target = 25;

        String expected = null;


        assertEquals(expected, TwoSum.twoNumbersSumToTarget(input, target));

    }

    @Test
    public void twoNumbersTestEmptyArray(){

        int[] input = {};
        int target = 11;

        String expected = null;


        assertEquals(expected, TwoSum.twoNumbersSumToTarget(input, target));

    }

    @Test
    public void twoNumbersTestOneValueInArray(){

        int[] input = {5};
        int target = 11;

        String expected = null;


        assertEquals(expected, TwoSum.twoNumbersSumToTarget(input, target));

    }

    @Test
    public void twoNumbersTestTwoValuesInArrayIsTarget(){

        int[] input = {5,6};
        int target = 11;

        String expected = "0 1";


        assertEquals(expected, TwoSum.twoNumbersSumToTarget(input, target));

    }
}
