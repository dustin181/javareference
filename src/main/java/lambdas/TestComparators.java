package lambdas;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class TestComparators {

    public static void main(String[] args) {

        final List<Person> people = Person.getPersons();

        Comparator<Person> compareAscending =
                (person1, person2) -> person1.ageDifference(person2);
        Comparator<Person> compareDescending = compareAscending.reversed();

        List<Person> ascendingAge =
                people.stream()
                        .sorted(Person::ageDifference) //or .sorted((person1, person2) -> person1.ageDifference(person2))
                        .collect(toList());
        printPeople("Sorted in ascending order by age: ", ascendingAge);

        people.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        final Function<Person, Integer> byAge = person -> person.getAge();
        final Function<Person, String> byTheirName = person -> person.getFirstName();

        printPeople("Sorted in ascending order by age and name: ",
                people.stream()
                        .sorted(comparing(byAge).thenComparing(byTheirName))
                        .collect(toList()));

        List<Person> olderThan20 =
                people.stream()
                        .filter(person -> person.getAge() > 20)
                        .collect(Collectors.toList());
        System.out.println("People older than 20: " + olderThan20);

        Map<Integer, List<Person>> peopleByAge =
                people.stream()
                        .collect(groupingBy(Person::getAge));
        System.out.println("Grouped by age: " + peopleByAge);

        Map<Integer, List<String>> nameOfPeopleByAge =
                people.stream()
                        .collect(
                                groupingBy(Person::getAge, mapping(Person::getFirstName, toList())));
        System.out.println("People grouped by age: " + nameOfPeopleByAge);

        Comparator<Person> byAge2 = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonOfEachLetter =
                people.stream()
                        .collect(groupingBy(person -> person.getFirstName().charAt(0),
                                reducing(BinaryOperator.maxBy(byAge2))));
        System.out.println("Oldest person of each letter:");
        System.out.println(oldestPersonOfEachLetter);

//        Comparator<Apple> byWeight =
//                (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

//        inventory.sort(comparing(Apple::getWeight)
//                .reversed()
//                .thenComparing(Apple::getCountry));
    }

    public static void printPeople(
            final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
