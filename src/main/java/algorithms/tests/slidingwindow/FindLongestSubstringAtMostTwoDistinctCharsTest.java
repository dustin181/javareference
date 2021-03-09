package algorithms.tests.slidingwindow;

import algorithms.slidingwindow.FindLongestSubstringAtMostTwoDistinctChars;
import org.junit.Assert;
import org.junit.Test;

public class FindLongestSubstringAtMostTwoDistinctCharsTest {

    @Test
    public void findLongestTest(){

        String s = "eceba";

        Assert.assertEquals(3, FindLongestSubstringAtMostTwoDistinctChars.findLongest(s));
    }

    @Test
    public void findLongestTest2(){

        String s = "ccaabbb";

        Assert.assertEquals(5, FindLongestSubstringAtMostTwoDistinctChars.findLongest(s));
    }
}
