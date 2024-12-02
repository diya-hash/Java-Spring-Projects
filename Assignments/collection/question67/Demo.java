package Assignments.collection.question67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(10);
        Collections.sort(al, new myComp());
        System.out.println(al);
    }
}

class myComp implements Comparator<Integer> {
    public int compare(Integer n, Integer o) {
        if (n < o)
            return -1;
        if (n > o)
            return -1;
        return 0;
    }
}
