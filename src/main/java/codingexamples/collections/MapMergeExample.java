package codingexamples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMergeExample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "9.6.1 ");
        map.put("mysql", "5.1 5.2 5.6 ");

        BiFunction<String, String, String> jdbcUrl = String::concat;

        String mySqlVersion = map.merge("mysql", "8.0 ", jdbcUrl);
        System.out.println(mySqlVersion);

        String mySqlVersion2 = map.merge("mysql", "9.0 ", jdbcUrl);
        System.out.println(mySqlVersion2);

        String derbyVersion = map.merge("derby", "10.11.1.1 ", jdbcUrl);

        System.out.println(map);

    }
}
