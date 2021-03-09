package algorithms.strings;

public class ReverseString {

    public static String reverse(String input) {

        int left = 0;
        int right = input.length() - 1;

        //String reversed = null;

        char[] reversed = input.toCharArray();

        while(left < right){
            char temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;

            left++;
            right--;
        }

        return new String(reversed);
    }
}
