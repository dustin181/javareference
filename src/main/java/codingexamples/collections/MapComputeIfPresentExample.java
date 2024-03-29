package codingexamples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapComputeIfPresentExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1");
        map.put("mysql", "192.168.0.50");

        BiFunction<String, String, String> jdbcUrl
                = (k, v) -> "jdbc:" + k + "://" + v + "/customers_db";

        String mySqlJdbcUrl = map.computeIfPresent("mysql", jdbcUrl);
        System.out.println(mySqlJdbcUrl);
    }


}
