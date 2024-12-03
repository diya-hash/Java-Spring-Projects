package Assignments.collection.question82;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("car", 1);
        map.put("truck", 2);
        map.put("ship", 5);
        for (String name : map.keySet()) {
            System.out.println(name + "\t" + map.get(name));
        }
    }
}
