package Assignments.collection.question85;

import java.util.HashMap;
import java.util.TreeMap;

import javax.print.attribute.HashAttributeSet;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        valueComparator vc = new valueComparator(map);
        TreeMap<String, Integer> tMap = new TreeMap<>(vc);
        map.put("four", 4);
        map.put("three", 3);
        map.put("two", 2);
        map.put("one", 1);
        tMap.putAll(map);
        for (String key : tMap.keySet()) {
            System.out.println(key + "\t : " + tMap.get(key));
        }
    }
}
