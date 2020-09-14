package codingexamples.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebuggingLambdas {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("anna", "bob",
                "christian", null, "carmen", "rick", "carla");

        names.stream()
                .peek(p -> System.out.println("\tstream(): " + p))
                .filter(s -> s.startsWith("c"))
                .peek(p -> System.out.println("\tfilter(): " + p))
                .map(String::toUpperCase)
                .peek(p -> System.out.println("\tmap(): " + p))
                .sorted()
                .peek(p -> System.out.println("\tsorted(): " + p))
                .collect(Collectors.toList());

    }
}
