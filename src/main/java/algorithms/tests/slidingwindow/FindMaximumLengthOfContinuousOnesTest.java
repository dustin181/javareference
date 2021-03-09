package algorithms.tests.slidingwindow;

import algorithms.slidingwindow.FindMaximumLengthOfContinuousOnes;
import org.junit.Assert;

public class FindMaximumLengthOfContinuousOnesTest {

    public void findMaximumLengthTest(){
        int A[] = {0,0,1,0,1,1,1,0,1,1};

        Assert.assertEquals(7, FindMaximumLengthOfContinuousOnes.findMaximumLength(A));
    }
}
