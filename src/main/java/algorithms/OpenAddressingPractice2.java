package algorithms;

import java.util.Arrays;

public class OpenAddressingPractice2 {
    
    static int MAX_SIZE = 7;
    static int[] hashtable = new int[MAX_SIZE];
    
    static int hash(int data){
        return data % MAX_SIZE;
    }
    
    static void insert(int data){
        
        int index = hash(data);
        
        while(hashtable[index] != -1){            
            index = (index + 1) % MAX_SIZE;
        }
        
        hashtable[index] = data;
    }

    static void insertQuadratic(int data){

        int index = hash(data);
        int i = 1;

        while(hashtable[index] != -1){
            index = (index + i * i) % MAX_SIZE;
            i++;
        }

        hashtable[index] = data;
    }

    static boolean search(int data){

        int index = hash(data);

        int i = 0;

        while(hashtable[index] != -1 && hashtable[index] != data && i <= MAX_SIZE){
            index = (index + 1) % MAX_SIZE;
            i++;
        }

        if(hashtable[index] == data){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Arrays.fill(hashtable, -1);

        insertQuadratic(50);
        insertQuadratic(700);
        insertQuadratic(76);
        insertQuadratic(85);
        insertQuadratic(92);
        insertQuadratic(73);
        insertQuadratic(101);

        System.out.println(search(101));
        System.out.println(search(222222));
        
        
    }
}
