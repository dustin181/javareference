package codingexamples.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class MapSortByValueExample {

    public static void main(String[] args) {

      /*  Map<String, Integer> sentiment =  posts.stream()
                .distinct()
                .map(s -> s.getContent())
                .map(s -> s.split((" ")))
                .flatMap(s -> arrays.stream(s))
                .filter(s -> StringUtils.isAllUpperCase(s))
                .filter(s -> !excludeList.contains(s))
                .collect(toMap(
                        w -> w.toString().toUpperCase(), w -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));*/
    }
}
