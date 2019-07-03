package algorithms;

public class ArrayOfCollections {


    public static void main(String[] args) {

        LinkedList5<Integer> arrayOfCollections[];
        arrayOfCollections = new LinkedList5[5];
        for(int i = 0;i < 5;i++){
            arrayOfCollections[i] = new LinkedList5<>();
        }
    }
}
