package Assignments.collection.question83;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("fox", 2);
        map.put("cat", 3);
        map.put("fox", 2);

        TreeMap<String, Integer> tMap = new TreeMap<>(map);
        map.clear();
        map.putAll(tMap);
        System.out.println(map);
    }
}
