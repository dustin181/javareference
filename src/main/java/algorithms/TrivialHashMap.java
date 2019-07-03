package algorithms;

import java.util.Arrays;

public class TrivialHashMap {

    static final int MAX_SIZE = 1000;
    static int[][] hashTable = new int[MAX_SIZE + 1][2];

    static void insert(Integer n){
        if(n >= 0){
            hashTable[n][0] = 1;
        } else {
            hashTable[Math.abs(n)][1] = 1;
        }
    }

    static boolean search(Integer n){
        if(n >= 0 && hashTable[n][0] == 1){
            return true;
        } else if (n < 0 && hashTable[n][1] == 1) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        System.out.println("test");

        insert(7);
        insert(5);
        insert(-3);
        insert(23);
        insert(44);
        insert(567);

        System.out.println( search(5));
        System.out.println( search(7));
        System.out.println( search(88));


    }
}
