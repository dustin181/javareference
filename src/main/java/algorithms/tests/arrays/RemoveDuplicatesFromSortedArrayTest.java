package algorithms.tests.arrays;

import algorithms.arrays.RemoveDuplicatesFromSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates(){

        int[] sortedArray = {1,1,2};

        int expected = 2;

        Assert.assertEquals(expected, RemoveDuplicatesFromSortedArray.remove(sortedArray));
    }

    @Test
    public void removeDuplicatesSecondSolution(){

        int[] sortedArray = {0,0,1,1,1,2,2,3,3,4};

        int expected = 5;

        Assert.assertEquals(expected, RemoveDuplicatesFromSortedArray.remove(sortedArray));
    }
}
