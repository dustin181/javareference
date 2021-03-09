package algorithms.tests.strings;

import algorithms.strings.TypedOutStrings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TypedOutStringsTest {

    @Test
    public void TypedOutStringsMatchingStringsTest(){

        String input1 = "ab#c";
        String input2 = "az#c";

        boolean expected = true;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void TypedOutStringsNonMatchingStringsTest(){

        String input1 = "abc#d";
        String input2 = "acc#c";

        boolean expected = false;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void TypedOutStringsMultipleHashesTest(){

        String input1 = "abc##d"; //ad
        String input2 = "abc####d"; //d

        boolean expected = false;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void TypedOutStringsReturnEmptyStringsTest(){

        String input1 = "x#y#z#";
        String input2 = "a#";

        boolean expected = true;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void TypedOutStringsInputEmptyStringsTest(){

        String input1 = "";
        String input2 = "";

        boolean expected = true;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void TypedOutStringsDifferentCaseTest(){

        String input1 = "abCD#ef";
        String input2 = "abcd#ef";

        boolean expected = false;

        assertEquals(expected, TypedOutStrings.checkStrings(input1, input2));

    }

    @Test
    public void RemoveHashesFromStringTest(){

        String input1 = "abcd#ef";

        Stack<Character> stack1 = new Stack<>();
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        stack1.push('e');
        stack1.push('f');

        String expected = stack1.toString();

        assertEquals(expected, TypedOutStrings.removeHashesFromString(input1));

    }

    @Test
    public void RemoveHashesFromStringMultipleHashesTest(){

        String input1 = "abcd####ef";

        Stack<Character> stack1 = new Stack<>();
        stack1.push('e');
        stack1.push('f');

        String expected = stack1.toString();

        assertEquals(expected, TypedOutStrings.removeHashesFromString(input1));

    }

    @Test
    public void RemoveHashesFromStringMultipleHashesAndHashAtEndTest(){

        String input1 = "abcd####ef###";

        Stack<Character> stack1 = new Stack<>();

        String expected = stack1.toString();

        assertEquals(expected, TypedOutStrings.removeHashesFromString(input1));

    }
}
