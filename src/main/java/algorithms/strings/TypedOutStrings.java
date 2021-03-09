package algorithms.strings;

import java.util.List;
import java.util.Stack;

public class TypedOutStrings {

    //brute force not the optimal space complexity
    public static boolean checkStrings(String input1, String input2) {

        String final1 = removeHashesFromString(input1);
        String final2 = removeHashesFromString(input2);

        return final1.equals(final2);
    }

//brute force
//    public static List<Character> removeHashesFromString(String input1) {
//
//        List<Character> final1 = new ArrayList<>();
//
//        int j = 0;
//
//        for(int i = 0;i < input1.length();i++) {
//            Character c = input1.charAt(i);
//            if(!c.equals('#')){
//                final1.add(c);
//                j++;
//            } else{
//                if(j > 0){
//                    final1.remove(j-1);
//                }
//
//                j--;
//            }
//        }
//
//        return final1;
//    }

//    //brute force
    public static String removeHashesFromString(String input1) {

        Stack<Character> final1 = new Stack<>();

        for(int i = 0;i < input1.length();i++) {
            Character c = input1.charAt(i);
            if(!c.equals('#')){
                final1.push(c);
            } else{
                if(!final1.empty()){
                    final1.pop();
                }

            }
        }

        return final1.toString();
    }
}
