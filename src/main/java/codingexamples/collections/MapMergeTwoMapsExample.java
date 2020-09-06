package codingexamples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMergeTwoMapsExample {

    public static void main(String[] args) {

        Map<Integer, Melon> melons1 = new HashMap<>();
        Map<Integer, Melon> melons2 = new HashMap<>();
        melons1.put(1, new Melon("Apollo", 3000));
        melons1.put(2, new Melon("Jade Dew", 3500));
        melons1.put(3, new Melon("Cantaloupe", 1500));
        melons2.put(3, new Melon("Apollo", 3000));
        melons2.put(4, new Melon("Jade Dew", 3500));
        melons2.put(5, new Melon("Cantaloupe", 1500));
    }

    public static <K, V> Map<K, V> mergeMaps(
            Map<K, V> map1, Map<K, V> map2) {

        Map<K, V> map = new HashMap<>(map1);

        map2.forEach(
                (key, value) -> map.merge(key, value, (v1, v2) -> v2));

        return map;
    }

    public static <K, V> Map<K, V> mergeMaps2(
            Map<K, V> map1, Map<K, V> map2) {

        Stream<Map.Entry<K, V>> combined
                = Stream.concat(map1.entrySet().stream(),
                map2.entrySet().stream());

        Map<K, V> map = combined.collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v2));

        return map;
    }


}
