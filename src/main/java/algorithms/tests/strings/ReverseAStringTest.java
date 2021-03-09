package algorithms.tests.strings;

import org.junit.Assert;
import org.junit.Test;
import algorithms.strings.ReverseString;

public class ReverseAStringTest {

    @Test
    public void ReverseStringNormalSolutionEvenNumChars(){

        String input = "duke";
        Assert.assertEquals("ekud", ReverseString.reverse(input));

    }

    @Test
    public void ReverseStringNormalSolutionOddNumChars(){

        String input = "queen";
        Assert.assertEquals("neeuq", ReverseString.reverse(input));

    }
}
