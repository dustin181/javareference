package algorithms.arrays;

public class WaterArea {


/*    public static String findLargestArea(int[] input) {

        String finalArea = null;
        int largestArea = 0;

        for(int i = 0;i < input.length;i++){
            for(int j = 1;j < input.length;j++){
                 int length = Math.min(input[i], input[j]);
                 int width = j-i;
                 int area = length * width;

                 if(area > largestArea){
                     largestArea = area;
                     finalArea = i + " " + j;
                 }

            }
        }

        return finalArea;

    }*/

    public static String findLargestArea(int[] input) {

        if(input.length == 1){
            return null;
        }

        String finalArea = null;
        int largestArea = 0;

        for(int i = 0, j = input.length - 1;i < input.length;){

            int width = j-i;
            int height = Math.min(input[i],input[j]);
            int area = height * width;

            if(area > largestArea){
                largestArea = area;
                finalArea = i + " " + j;
            }

            if(input[i] < input[j]){
                i++;
            } else{
                j--;
            }

            if(width == 1){
                break;
            }
        }

        return finalArea;

    }
}
