package algorithms.arrays;

public class MaximumSumFromArrayOfSizeN {

      //brute force
//    public static int findMaximum(int[] input, int k) {
//
//        int maxSum = 0;
//
//        int i = 0;
//        int j = k - 1;
//
//        while(j < input.length){
//            maxSum = Math.max(maxSum, getMaxSumFromWindow(input, i, j));
//            i++;
//            j++;
//        }
//
//        return maxSum;
//    }
//
//    private static int getMaxSumFromWindow(int[] input, int start, int end) {
//
//        int sum = 0;
//
//        for(int x = start;x <= end;x++){
//
//            sum += input[x];
//
//        }
//
//        return sum;
//    }

    public static int findMaximum(int[] input, int k) {

        int maxSum = 0;

        for(int i = 0; i < k;i++){
            maxSum += input[i];
        }

        int windowSum = maxSum;

        for(int i = k;i <= input.length - 1;i++){
            windowSum += input[i] - input[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
