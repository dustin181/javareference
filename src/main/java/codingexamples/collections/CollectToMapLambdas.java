package codingexamples.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapLambdas {

    public static void main(String[] args) {

        List<Melon> melons = Arrays.asList(new Melon("Crenshaw", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700),
                new Melon("Gac", 3000), new Melon("Cantaloupe", 2600));

        Map<String, Integer> resultToMap = melons.stream()
                .distinct()
                .collect(Collectors.toMap(Melon::getType,
                        Melon::getWeight));

        //avoids illegal state by choosing existing if duplicate
        Map<String, Integer> resultToMap2 = melons.stream()
                .collect(Collectors.toMap(Melon::getType, Melon::getWeight,
                        (oldValue, newValue) -> oldValue));

        String str = "Lorem Ipsum is simply Ipsum Lorem not simply Ipsum";

        //word frequency
        Map<String, Integer> mapOfWords = Stream.of(str)
                .map(w -> w.split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toMap(
                        w -> w.toLowerCase(), w -> 1, Integer::sum));

    }
}
