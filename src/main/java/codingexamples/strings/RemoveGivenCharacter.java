package codingexamples.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveGivenCharacter {

    public static String removeCharacterRegExp(String str, char ch) {

        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String removeCharacterLambda(String str, char ch) {

        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }


}
