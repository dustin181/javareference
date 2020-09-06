package codingexamples.collections;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapComputeIfAbsentExample {

    public static void main(String[] args) throws UnknownHostException {

        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "jdbc:postgresql://127.0.0.1/customers_db");
        map.put("mysql", "jdbc:mysql://192.168.0.50/customers_db");

        String address = InetAddress.getLocalHost().getHostAddress();

        Function<String, String> jdbcUrl
                = k -> k + "://" + address + "/customers_db";

        String mongodbJdbcUrl = map.computeIfAbsent("mongodb", jdbcUrl);
        System.out.println(mongodbJdbcUrl);
    }
}
