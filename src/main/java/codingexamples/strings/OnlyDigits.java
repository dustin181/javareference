package codingexamples.strings;

import java.util.stream.IntStream;

public class OnlyDigits {

    public static void main(String[] args) {

        String test = "545454";
        String test2 = "nodigits5656565here";

        //System.out.println(containsOnlyDigitsLambda(test));

    }

    public static boolean containsOnlyDigitsFast(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean containsOnlyDigitsLambda(String str) {

        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigitsRegExp(String str) {

        return str.matches("[0-9]+");
    }
}
