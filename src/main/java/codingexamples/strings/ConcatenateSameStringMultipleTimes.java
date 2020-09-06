package codingexamples.strings;

import java.util.Collections;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ConcatenateSameStringMultipleTimes {

    public static void main(String[] args) {

        String TEXT = "concatenateme";

        String result = String.join("", Collections.nCopies(5, TEXT));

        String result2 = Stream.generate(() -> TEXT)
                .limit(5)
                .collect(joining());

        System.out.println(result);
        System.out.println(result2);

    }
}
