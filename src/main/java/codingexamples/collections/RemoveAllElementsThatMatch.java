package codingexamples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllElementsThatMatch {

    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        List<Melon> filteredMelons = melons.stream()
                .filter(t -> t.getWeight() >= 3000)
                .collect(Collectors.toList());

        melons.removeIf(t -> t.getWeight() < 3000);

        System.out.println(melons);

        System.out.println(filteredMelons);


    }
}
