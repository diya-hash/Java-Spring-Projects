package Assignments.collection.question75;

import java.util.ArrayList;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(5);
        al.add(7);
        al.add(16);
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(100);
        al1.add(7);
        al1.add(5);
        al1.add(56);
        al1.add(17);
        al1.add(17);
        al1.add(26);

        ArrayList<Integer> al2 = new ArrayList<>(al);
        al2.addAll(al1);
        TreeSet<Integer> set = new TreeSet<>(al2);
        al2.clear();
        al2.addAll(set);
        System.out.println(al2);
    }
}
