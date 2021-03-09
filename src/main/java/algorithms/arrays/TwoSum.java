package algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//Brute Force
/*    public static String twoNumbersSumToTarget(int[] input, int target) {

        for(int i = 0;i < input.length;i++){
            for(int j = 1;j < input.length;j++){
                if(input[i] + input[j] == target){
                    return i + " " + j;
                }
            }
        }

        return null;
    }*/

/*    public static String twoNumbersSumToTarget(int[] input, int target) {

        for(int i = 0;i < input.length;i++){
            int numberToFind = target - input[i];
            for(int j = 1;j < input.length;j++){
                if(numberToFind == input[j]){
                    return i + " " + j;
                }
            }
        }

        return null;
    }*/

    public static String twoNumbersSumToTarget(int[] input, int target) {

        Map<Integer, Integer> numbersToFind = new HashMap<>();

        for(int i = 0;i < input.length;i++){

            int currentMapValue = numbersToFind.getOrDefault(input[i], -1);

            if(currentMapValue >= 0){
                return currentMapValue + " " + i;
            } else {
                int numberToFind = target - input[i];
                numbersToFind.put(numberToFind,i);
            }
        }

        return null;
    }


}
