package Assignments.collection.question69;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee(102, "ram", 1000);
        Employee e2 = new Employee(103, "shyam", 2000);
        Employee e3 = new Employee(101, "sam", 3000);
        Employee e4 = new Employee(104, "sameer", 3000);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        Collections.sort(al);
        for (Employee e : al) {
            System.out.println(e.getId() + "\t" + e.getName());
        }
    }
}