package algorithms.arrays;

public class RemoveDuplicatesFromSortedArray {


    public static int remove(int[] sortedArray) {

        int left = 0;

        for(int right = 1;right < sortedArray.length;right++){

            if(sortedArray[left] != sortedArray[right]){
                left++;
                sortedArray[left] = sortedArray[right];
            }
        }

        return left + 1;
    }
}
