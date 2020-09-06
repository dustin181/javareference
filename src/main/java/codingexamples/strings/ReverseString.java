package codingexamples.strings;

public class ReverseString {

    public static void main(String[] args) {

        String test2 = "the quick brown fox jumped over the lazy red dog";
        System.out.println(reverse(test2));
    }

    public static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
