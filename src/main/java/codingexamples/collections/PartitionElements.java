package codingexamples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionElements {

    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        Map<Boolean, List<Melon>> separatedMelons = melons.stream()
                .collect(Collectors.partitioningBy(
                        (Melon t) -> t.getWeight() >= 3000));

        List<Melon> weightLessThan3000 = separatedMelons.get(false);
        List<Melon> weightGreaterThan3000 = separatedMelons.get(true);

        System.out.println(weightLessThan3000);
        System.out.println(weightGreaterThan3000);

    }
}
