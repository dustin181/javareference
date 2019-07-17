package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

public class TestReduceCollections {

    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        System.out.println("Total number of characters in all names: " +
                friends.stream()
                        .mapToInt(name -> name.length())
                        .summaryStatistics());

        final Optional<String> aLongName =
                friends.stream()
                        .reduce((name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name ->
                System.out.println(String.format("A longest name: %s", name)));

        System.out.println(
                friends.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", ")));
    }


}
