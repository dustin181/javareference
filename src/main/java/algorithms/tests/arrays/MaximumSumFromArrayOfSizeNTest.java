package algorithms.tests.arrays;

import algorithms.arrays.MaximumSumFromArrayOfSizeN;
import org.junit.Assert;
import org.junit.Test;

public class MaximumSumFromArrayOfSizeNTest {

    @Test
    public void MaximumSumNormalSolution(){

        int[] input = {100,200,300,400};
        int k = 2;

        Assert.assertEquals(700, MaximumSumFromArrayOfSizeN.findMaximum(input, k));
    }

    @Test
    public void MaximumSumNormalSolution2(){

        int[] input = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        Assert.assertEquals(39, MaximumSumFromArrayOfSizeN.findMaximum(input, k));
    }
}
