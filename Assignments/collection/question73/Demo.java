package Assignments.collection.question73;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(7);
        al.add(5);
        al.add(16);
        al.add(7);
        al.add(16);
        TreeSet<Integer> set = new TreeSet<>(al);
        al.clear();
        al.addAll(set);

        System.out.println(al);
    }
}
