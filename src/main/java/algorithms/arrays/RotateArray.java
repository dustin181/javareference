package algorithms.arrays;

import java.util.Arrays;

public class RotateArray {

    //brute force
    public static String rotateByNRight(int[] input, int steps) {

        for(int i = 0;i < steps;i++){
            rotateByOneRight(input);

        }

        return Arrays.toString(input);
    }

    public static void rotateByOneRight(int[] input) {

        int last = input[input.length - 1];

        for(int i = input.length - 1;i > 0;i--){
            input[i] = input[i - 1];
        }

        input[0] = last;

    }

    public static void rotateByOneLeft(int[] input) {

        int first = input[0];

        for(int i = 0;i < input.length - 1;i++){
            input[i] = input[i + 1];
        }

        input[input.length - 1] = first;

    }

    public static String rotateByNLeft(int[] input, int steps) {

        for(int i = 0;i < steps;i++){
            rotateByOneLeft(input);

        }

        return Arrays.toString(input);
    }

    public static String rotateByNRightInPlace(int[] input, int k) {

        return rightRotate(input, k, input.length);
    }

    public static void swap(int[] input, int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }

    public static void reverse(int[] input, int low, int high){

        for(int i = low, j = high;i < j;i++, j--){
            swap(input, i, j);
        }
    }

    public static String rightRotate(int[] input, int k, int length){

        reverse(input, length-k, length-1);

        reverse(input, 0, length-k-1);

        reverse(input, 0, length-1);

        return Arrays.toString(input);
    }

    public static String rotateByNLeftInPlace(int[] input, int k) {

        return leftRotate(input, k, input.length);
    }

    private static String leftRotate(int[] input, int k, int length) {

        reverse(input, 0, k-1);

        reverse(input, k, length-1);

        reverse(input, 0, length-1);


        return Arrays.toString(input);
    }
}
