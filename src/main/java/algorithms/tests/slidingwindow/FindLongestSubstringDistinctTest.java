package algorithms.tests.slidingwindow;

import algorithms.slidingwindow.FindLongestSubStringDistinct;
import org.junit.Assert;
import org.junit.Test;

public class FindLongestSubstringDistinctTest {

    @Test
    public void findlongest(){

        String s = "findlongestsubstring";

        Assert.assertEquals(8, FindLongestSubStringDistinct.findLongest(s));

    }

    @Test
    public void findlongest2(){

        String s = "abbcdafeegh";

        Assert.assertEquals(6, FindLongestSubStringDistinct.findLongest(s));

    }
}
