package algorithms.arrays;

public class TrappingRainwater {

//brute force
//    public static Integer findTrappedWater(int[] input) {
//
//        //current water = min(maxL, maxR) - cH
//        int total = 0;
//
//        for(int i = 0;i < input.length;i++){
//
//            int leftP = i;
//            int rightP = i;
//            int maxL = 0;
//            int maxR = 0;
//
//            while(leftP >= 0) {
//                maxL = Math.max(input[leftP], maxL);
//                leftP--;
//            }
//
//            while(rightP < input.length) {
//                maxR = Math.max(input[rightP], maxR);
//                rightP++;
//            }
//
//            int current_water = Math.min(maxL, maxR) - input[i];
//
//            if(current_water > 0){
//                total = total + current_water;
//            }
//
//        }
//
//        return total;
//
//    }

    public static Integer findTrappedWater(int[] input) {

        if(input.length < 3){
            return 0;
        }

        int leftP = 0;
        int rightP = input.length - 1;
        int maxLeft = input[leftP];
        int maxRight = input[rightP];
        int total = 0;

        while(leftP < rightP){

            if(input[leftP] <= input[rightP]){
                if(input[leftP] >= maxLeft){
                    maxLeft = input[leftP];
                } else {
                    int current_water = maxLeft - input[leftP];
                    total += current_water;
                }

                leftP++;

            } else{
                if(input[rightP] >= maxRight){
                    maxRight = input[rightP];
                } else {
                    int current_water = maxRight - input[rightP];
                    total += current_water;
                }

                rightP--;
            }
        }

        return total;
    }
}
