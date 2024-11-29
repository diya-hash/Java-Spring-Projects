package Assignments.collection.question66;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(10);
        System.out.print(al + "\t");
        Collections.reverse(al);
        System.out.print(al + "\t");
    }
}
