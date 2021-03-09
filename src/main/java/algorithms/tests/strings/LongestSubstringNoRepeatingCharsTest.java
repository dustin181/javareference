package algorithms.tests.strings;

import algorithms.strings.LongestSubstring;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringNoRepeatingCharsTest {

    @Test
    public void LongestSubstringNormalSolution(){

        String input = "abccabb";

        Assert.assertEquals(3, LongestSubstring.findLongestSubstring(input));
    }

    @Test
    public void LongestSubstringNormalSolution2(){

        String input = "abcbdaac";

        Assert.assertEquals(4, LongestSubstring.findLongestSubstring(input));
    }

    @Test
    public void LongestSubstringNormalSolution3(){

        String input = "abcabcbb";

        Assert.assertEquals(3, LongestSubstring.findLongestSubstring(input));
    }

    @Test
    public void LongestSubstringNormalSolution4(){

        String input = "pwwkew";

        Assert.assertEquals(3, LongestSubstring.findLongestSubstring(input));
    }

//    @Test
//    public void LongestSubstringOverlapping(){
//
//        String input = "abcbda";
//
//        Assert.assertEquals(4, LongestSubstring.findLongestSubstring(input));
//    }

    @Test
    public void LongestSubstringSameCharacters(){

        String input = "ccccc";

        Assert.assertEquals(1, LongestSubstring.findLongestSubstring(input));
    }

    @Test
    public void LongestSubstringOneCharacter(){

        String input = "f";

        Assert.assertEquals(1, LongestSubstring.findLongestSubstring(input));
    }

    @Test
    public void LongestSubstringEmptyString(){

        String input = "";

        Assert.assertEquals(0, LongestSubstring.findLongestSubstring(input));
    }
}
