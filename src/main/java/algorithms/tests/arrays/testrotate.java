package algorithms.tests.arrays;

import java.util.Arrays;

public class testrotate {

    public static void main(String[] args) {

        //(product * pow(a[i], -1))

        int[] nums = {10, 3, 5, 6, 2};

        int product = 1;

        for(int num: nums){
            product *= num;
        }

        System.out.println(product);

        for(int num: nums){
            System.out.println(product * Math.pow(num, -1));
        }

        for(int num: nums){
            System.out.println(product/num);
        }

    }
}
