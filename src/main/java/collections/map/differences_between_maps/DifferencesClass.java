package collections.map.differences_between_maps;

import java.util.*;

public class DifferencesClass {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();//order by hashcode
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//order by adding
        Map<Integer, String> treeMap = new TreeMap<>();//order by key`s value

        testMap(hashMap);
        System.out.println("------------------------");
        testMap(linkedHashMap);
        System.out.println("------------------------");
        testMap(treeMap);
        /**
         * Key: 0, Value: Anna
         * Key: 3, Value: Tom
         * Key: 20, Value: Tom
         * Key: 1780, Value: Tim
         * Key: 200, Value: Alice
         * ------------------------
         * Key: 20, Value: Tom
         * Key: 200, Value: Alice
         * Key: 0, Value: Anna
         * Key: 1780, Value: Tim
         * Key: 3, Value: Tom
         * ------------------------
         * Key: 0, Value: Anna
         * Key: 3, Value: Tom
         * Key: 20, Value: Tom
         * Key: 200, Value: Alice
         * Key: 1780, Value: Tim
         */
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(20, "Tom");
        map.put(200, "Alice");
        map.put(0, "Anna");
        map.put(1780, "Tim");
        map.put(3, "Tom");

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}
