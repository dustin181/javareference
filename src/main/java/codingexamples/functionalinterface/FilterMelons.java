package codingexamples.functionalinterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FilterMelons {

    public static void main(String[] args) {

        List<Melon> melons = new ArrayList<>();

        melons.add(new Melon("Apollo", 3000, "US"));
        melons.add(new Melon("Jade Dew", 5500, "US"));
        melons.add(new Melon("Cantaloupe", 1500, "US"));
        melons.add(new Melon("Gac", 1600, "US"));
        melons.add(new Melon("Hami", 1400, "US"));

        List<Melon> gacs = FilterMelons.filterMelons(
                melons, new GacMelonPredicate());

        System.out.println(gacs);

        List<Melon> huge = FilterMelons.filterMelons(
                melons, new HugeMelonPredicate());

        System.out.println(huge);

    }

    public static List<Melon> filterMelons(
            List<Melon> melons, MelonPredicate predicate) {

        List<Melon> result = new ArrayList<>();

        for (Melon melon: melons) {
            if (melon != null && predicate.test(melon)) {
                result.add(melon);
            }
        }

        return result;
    }
}
