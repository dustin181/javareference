package codingexamples.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FlatMapLambdas {

    public static void main(String[] args) {

        Melon[][] melonsArray = {
                {new Melon("Gac", 2000), new Melon("Hemi", 1600)},
                {new Melon("Gac", 2000), new Melon("Apollo", 2000)},
                {new Melon("Horned", 1700), new Melon("Hemi", 1600)}
        };

        Stream<Melon[]> streamOfMelonsArray = Arrays.stream(melonsArray);

        List<Melon> melons = streamOfMelonsArray
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        melons.forEach(System.out::println);

        List<List<String>> melonLists = Arrays.asList(
                Arrays.asList("Gac", "Cantaloupe"),
                Arrays.asList("Hemi", "Gac", "Apollo"),
                Arrays.asList("Gac", "Hemi", "Cantaloupe"),
                Arrays.asList("Apollo"),
                Arrays.asList("Horned", "Hemi"),
                Arrays.asList("Hemi"));

        List<String> distinctNames = melonLists.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        distinctNames.forEach(System.out::println);



    }
}
