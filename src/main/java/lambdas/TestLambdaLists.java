package lambdas;

import java.util.Arrays;
import java.util.List;

public class TestLambdaLists {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.forEach(name -> System.out.println(name));
        friends.forEach(System.out::println);

        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));

        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));






    }
}
