package codingexamples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapPutIfAbsentExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "postgresql");
        map.put(2, "mysql");
        map.put(3, null);

        String v1 = map.putIfAbsent(1, "derby");     // postgresql
        String v2 = map.putIfAbsent(3, "derby");     // null
        String v3 = map.putIfAbsent(4, "cassandra"); // null

        System.out.println(map);
    }
}
