package codingexamples.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String test = "ffrreeffffeeelopsxm";
        //System.out.println(removeDuplicates(test));

    }

    public static String removeDuplicates(String str) {

        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
