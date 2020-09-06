package codingexamples.strings;



import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class CountVowelsAndConsonants {



    private static final Set<Character> allVowels
            = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Long, Long> countVowelsAndConsonants(String str) {

        str = str.toLowerCase();

        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch<= 'z'))
                .count();

//        return Pair.of(vowels, consonants);

        return null;
    }

    public static Pair<Long, Long> countVowelsAndConsonantsShorter(String str) {

        Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(partitioningBy(c -> allVowels.contains(c), counting()));

//        return Pair.of(result.get(true), result.get(false));
        return null;
    }

}





