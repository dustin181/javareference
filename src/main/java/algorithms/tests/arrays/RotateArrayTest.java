package algorithms.tests.arrays;


import algorithms.arrays.RotateArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateArrayTest {

    @Test
    public void RotateArrayBy1PlacesRight(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {7,1,2,3,4,5,6};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNRight(input, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateArrayBy2PlacesRight(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {6,7,1,2,3,4,5};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNRight(input, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateArrayBy3PlacesRight(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {5,6,7,1,2,3,4};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNRight(input, 3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateArrayBy1PlacesLeft(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {2,3,4,5,6,7,1};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNLeft(input, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateArrayBy2PlacesLeft(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {3,4,5,6,7,1,2};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNLeft(input, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateArrayBy3PlacesLeft(){
        int[] input = {1,2,3,4,5,6,7};
        int[] intExpected = {4,5,6,7,1,2,3};

        String expected = Arrays.toString(intExpected);
        String actual = RotateArray.rotateByNLeft(input, 3);

        Assert.assertEquals(expected, actual);
    }


}
