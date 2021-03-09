package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTargetSumIfSorted {
    public static List<Integer> findSum(int[] sortedArray, int target) {

        List<Integer> values = new ArrayList<>();

        int left = 0;
        int right = sortedArray.length - 1;

        while(left < right){
            if(sortedArray[left] + sortedArray[right] == target){
                values.add(left);
                values.add(right);
            }

            if(left < right){
                left++;
            } else {
                right--;
            }
        }


        return values;
    }

}
