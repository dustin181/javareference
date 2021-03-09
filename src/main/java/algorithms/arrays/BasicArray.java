package algorithms.arrays;

public class BasicArray {

    public static void main(String[] args) {
        String[] test = {"a", "b", "c", "d"};
        String[] test2 = new String[20];

        for (String s: test) {
           // System.out.println(s);
        }

        System.out.println(test[2]);
        //System.out.println(test[20]);
        System.out.println(test2[4]);
    }
}
