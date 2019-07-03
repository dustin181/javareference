package algorithms;

import java.util.Arrays;


public class OpenAddressingPractice {

    static int MAX_SIZE = 7;
    static int[] hashTable = new int[MAX_SIZE];

    public static void main(String[] args) {

        Arrays.fill(hashTable, -1);

        System.out.println("test");

        insertQuadratic(50);
        insertQuadratic(700);
        insertQuadratic(76);
        insertQuadratic(85);
        insertQuadratic(92);
        insertQuadratic(73);
        insertQuadratic(101);

        System.out.println( searchQuadratic(50));
        System.out.println( searchQuadratic(76));
        System.out.println( searchQuadratic(22));
    }

    private static void insert(int n) {

        int index = hash(n);

        while(hashTable[index] != -1){
            index = (index + 1) % MAX_SIZE;
        }

        hashTable[index] = n;

    }

    private static void insertQuadratic(int n) {

        int index = hash(n);
        int quadratic = 1;

        while(hashTable[index] != -1){
            index = (index + quadratic * quadratic) % MAX_SIZE;
            quadratic++;
        }

        hashTable[index] = n;

    }


    private static boolean search(int n) {
        int index = hash(n);
        int i = 0;

        while(hashTable[index] != -1 && hashTable[index] != n && i < MAX_SIZE){
            index = (index + 1) % MAX_SIZE;
            i++;
        }

        if(hashTable[index] == n){
            return true;
        } else {
            return false;
        }
    }

    private static boolean searchQuadratic(int n) {
        int index = hash(n);
        int i = 0;
        int quadratic = 1;

        while(hashTable[index] != -1 && hashTable[index] != n && i < MAX_SIZE){
            index = (index + quadratic * quadratic) % MAX_SIZE;
            i++;
        }

        if(hashTable[index] == n){
            return true;
        } else {
            return false;
        }
    }

    static int hash(int n){

        return n % MAX_SIZE;
    }
}
