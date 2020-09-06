package codingexamples.strings;

import java.util.Map;
import java.util.stream.Collectors;


public class CountDuplicateCharacters {

    public static void main(String[] args) {

        String test = "llkkskejurnhrhkhrek";

        System.out.println(countDuplicateCharacters(test));
    }

    public static Map<Character, Long> countDuplicateCharacters(String str) {

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }
}
