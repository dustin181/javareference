package algorithms;

import java.util.Arrays;

public class OpenAddressing {

    static final int MAX_SIZE = 7;
    static int[] hashTable = new int[MAX_SIZE];

    static void insert(int n){

        int index = hash(n);

        int i = 1;

        while(hashTable[index] != -1){
            index =  (index + i * i) % MAX_SIZE;
            i++;
        }

        hashTable[index] = n;
    }

    static boolean search(int n){

        int index = hash(n);

        int i = 1;

        while(hashTable[index] != n && hashTable[index] != -1 && index != MAX_SIZE - 1){
            index =  (index + i * i) % MAX_SIZE;
            i++;
        }

        if(hashTable[index] == n){
            return true;
        } else {
            return false;
        }

    }

    static int hash(int n){
        int calc = n % MAX_SIZE;
        //System.out.println("hash is: " + calc );
        return calc;
    }


    public static void main(String[] args) {

        Arrays.fill(hashTable, -1);

        System.out.println("test");

        insert(50);
        insert(700);
        insert(76);
        insert(85);
        insert(92);
        insert(73);
        insert(101);

        System.out.println( search(50));
        System.out.println( search(76));
        System.out.println( search(22));


    }
}
