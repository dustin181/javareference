package algorithms.tests.slidingwindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class testrange {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('a', 0);
        map.put('b', 2);
        map.put('c', 3);
        System.out.println(map);

        map.put('a', map.get('a') + 1);
        System.out.println(map);

        int del_idx = Collections.min(map.keySet());
        System.out.println(del_idx);
        map.remove(97);
        System.out.println(map);

    }
}
