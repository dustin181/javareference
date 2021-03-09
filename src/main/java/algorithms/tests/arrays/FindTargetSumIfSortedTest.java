package algorithms.tests.arrays;

import algorithms.arrays.FindTargetSumIfSorted;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindTargetSumIfSortedTest {

    @Test
    public void findTargetSum(){

        int[] sortedArray = {1,2,3,4,5,6,7};
        int target = 13;

        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);

        Assert.assertEquals(expected, FindTargetSumIfSorted.findSum(sortedArray, 13));
    }

}
