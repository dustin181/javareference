package lambdas;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TestStreams {

    public static void main(String[] args) {

//        Map<Currency, List<Transaction>> transactionsByCurrencies =
//                transactions.stream()
//                        .filter((Transaction t) -> t.getPrice() > 1000)
//                        .collect(groupingBy(Transaction::getCurrency));

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

//        List<String> lowCaloricDishesName =
//                menu.stream()
//                        .filter(d -> d.getCalories() < 400)
//                        .sorted(comparing(Dish::getCalories))
//                        .map(Dish::getName)
//                        .collect(toList());

//        List<String> threeHighCaloricDishNames =
//                menu.stream()
//                        .filter(d -> d.getCalories() > 300)
//                        .map(Dish::getName)
//                        .limit(3)
//                        .collect(toList());
//        System.out.println(threeHighCaloricDishNames);
//
//        long count = menu.stream()
//                .filter(d -> d.getCalories() > 300)
//                .distinct()
//                .limit(3)
//                .count();
//        System.out.println(count);

//        List<Dish> vegetarianDishes =
//                menu.stream()
//                        .filter(Dish::isVegetarian)
//                        .collect(toList());
//        System.out.println(vegetarianDishes);

//        List<Integer> dishNameLengths = menu.stream()
//                .map(Dish::getName)
//                .map(String::length)
//                .collect(toList());
//        System.out.println(dishNameLengths);

        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        List<String> uniqueCharacters =
                words.stream()
                        .map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(uniqueCharacters);


    }

}
