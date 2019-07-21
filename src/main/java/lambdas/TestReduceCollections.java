package lambdas;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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

//        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
//        int sum = numbers.stream().reduce(0, Integer::sum);
//
//
//        int product = numbers.stream().reduce(1, (a, b) -> a * b);
//
//        Optional<Integer> max = numbers.stream().reduce(Integer::max);
//        Optional<Integer> min = numbers.stream().reduce(Integer::min);

//        int calories = menu.stream()
//                .mapToInt(Dish::getCalories)
//                .sum();

//        OptionalInt maxCalories = menu.stream()
//                .mapToInt(Dish::getCalories)
//                .max();
//
//        int max = maxCalories.orElse(1);

//        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
//        stream.map(String::toUpperCase).forEach(System.out::println);
//
//        int[] numbers = {2, 3, 5, 7, 11, 13};
//        int sum = Arrays.stream(numbers).sum();
//
//        long uniqueWords = 0;
//        try(Stream<String> lines =
//                    Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
//            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
//                    .distinct()
//                    .count();
//        }
//        catch(IOException e){
//        }
//
//        long howManyDishes = menu.stream().count();
//
//        Comparator<Dish> dishCaloriesComparator =
//                Comparator.comparingInt(Dish::getCalories);
//        Optional<Dish> mostCalorieDish =
//                menu.stream()
//                        .collect(maxBy(dishCaloriesComparator));
//
//        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
//
//        double avgCalories =
//                menu.stream().collect(averagingInt(Dish::getCalories));
//
//        IntSummaryStatistics menuStatistics =
//                menu.stream().collect(summarizingInt(Dish::getCalories));
//
//        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
//
//        Map<Dish.Type, List<Dish>> dishesByType =
//                menu.stream().collect(groupingBy(Dish::getType));
//
//        public enum CaloricLevel { DIET, NORMAL, FAT }
//        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(
//                groupingBy(dish -> {
//                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
//                    else if (dish.getCalories() <= 700) return
//                            CaloricLevel.NORMAL;
//                    else return CaloricLevel.FAT;
//                } ));
//
//    }
//
//    Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel =
//    menu.stream().collect(
//            groupingBy(Dish::getType,
//                    groupingBy(dish -> {
//                        if (dish.getCalories() <= 400) return CaloricLevel.DIET;
//                        else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
//                        else return CaloricLevel.FAT;
//                    } )
//            )
//    );
//
//    Map<Dish.Type, Long> typesCount = menu.stream().collect(
//            groupingBy(Dish::getType, counting()));
//
//    Map<Dish.Type, Optional<Dish>> mostCaloricByType =
//            menu.stream()
//                    .collect(groupingBy(Dish::getType,
//                            maxBy(comparingInt(Dish::getCalories))));
//
//    Map<Dish.Type, Dish> mostCaloricByType =
//            menu.stream()
//                    .collect(groupingBy(Dish::getType,
//                            collectingAndThen(
//                                    maxBy(comparingInt(Dish::getCalories)),
//                                    Optional::get)));
//
//    Map<Dish.Type, Integer> totalCaloriesByType =
//            menu.stream().collect(groupingBy(Dish::getType,
//                    summingInt(Dish::getCalories)));
//
//    Map<Boolean, List<Dish>> partitionedMenu =
//            menu.stream().collect(partitioningBy(Dish::isVegetarian));
//
//    List<Dish> vegetarianDishes = partitionedMenu.get(true);
//
//    Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType =
//            menu.stream().collect(
//                    partitioningBy(Dish::isVegetarian,
//                            groupingBy(Dish::getType)));
//
//    Map<Boolean, Dish> mostCaloricPartitionedByVegetarian =
//            menu.stream().collect(
//                    partitioningBy(Dish::isVegetarian,
//                            collectingAndThen(
//                                    maxBy(comparingInt(Dish::getCalories)),
//                                    Optional::get)));
    }





}
