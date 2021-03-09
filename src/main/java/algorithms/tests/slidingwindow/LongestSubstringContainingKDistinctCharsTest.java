package algorithms.tests.slidingwindow;

import algorithms.slidingwindow.LongestSubstringContainingKDistinctChars;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringContainingKDistinctCharsTest {

    @Test
    public void testKequals2(){

        String s = "abcbdbdbbdcdabd";

        int k = 2;

        Assert.assertEquals("bdbdbbd", LongestSubstringContainingKDistinctChars.findLongest(s, k));
    }

    @Test
    public void testKequals3(){

        String s = "abcbdbdbbdcdabd";

        int k = 3;

        Assert.assertEquals("bcbdbdbbdcd", LongestSubstringContainingKDistinctChars.findLongest(s, k));
    }
}
