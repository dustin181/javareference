package algorithms.tests.slidingwindow;

import algorithms.slidingwindow.FindLongestWithAtLeastKRepeating;
import org.junit.Assert;
import org.junit.Test;

public class FindLongestWithAtLeastKRepeatingTest {

    @Test
    public void findLongest(){

        String s = "aaabb";
        int k = 3;

        Assert.assertEquals(3, FindLongestWithAtLeastKRepeating.findLongest(s, k));
    }
}
