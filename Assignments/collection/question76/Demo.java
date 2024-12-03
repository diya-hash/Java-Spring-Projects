package Assignments.collection.question76;

import java.util.ArrayList;

import Assignments.OOP.Employee;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "sam", 1000));
        al.add(new Employee(102, "sameer", 2000));
        al.add(new Employee(103, "shyam", 3000));
        al.add(new Employee(104, "ram", 4000));
        al.add(new Employee(105, "ramesh", 5000));
        al.add(new Employee(106, "sameera", 6000));

        ArrayList<Integer> idList = new ArrayList<>();
        for (Employee e : al) {
            idList.add(e.getId());
        }
        System.out.println(idList);
    }
}
