package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicateAndFilters {

    @FunctionalInterface
    public interface Predicate<T>{
        boolean test(T t);
    }

    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

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

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");

//        final long countEditorsStartN =
//                editors.stream()
//                        .filter(startsWithN)
//                        .count();
//        final long countComradesStartN =
//                comrades.stream()
//                        .filter(startsWithN)
//                        .count();

//        final long countFriendsStartN =
//                friends.stream()
//                        .filter(startsWithN)
//                        .count();
//        final long countFriendsStartB =
//                friends.stream()
//                        .filter(startsWithB)
//                        .count();

        final Function<String, Predicate<String>> startsWithLetter =
                letter -> name -> name.startsWith(letter);

//        final long countFriendsStartN =
//                friends.stream()
//                        .filter(startsWithLetter.apply("N"))
//                        .count();
//        final long countFriendsStartB =
//                friends.stream()
//                        .filter(startsWithLetter.apply("B"))
//                        .count();

//        Predicate<Apple> notRedApple = redApple.negate();
//
//        Predicate<Apple> redAndHeavyApple =
//                redApple.and(a -> a.getWeight() > 150);
//
//        Predicate<Apple> redAndHeavyAppleOrGreen =
//                redApple.and(a -> a.getWeight() > 150)
//                        .or(a -> "green".equals(a.getColor()));

    }

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    public static void pickName(
            final List<String> names, final String startingLetter) {
        final Optional<String> foundName =
                names.stream()
                        .filter(name ->name.startsWith(startingLetter))
                        .findFirst();
        System.out.println(String.format("A name starting with %s: %s",
                startingLetter, foundName.orElse("No name found")));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }


}
