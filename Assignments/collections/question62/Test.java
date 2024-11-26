package Assignments.collections.question62;

import java.util.Enumeration;
import java.util.Vector;

import Assignments.OOP.Employee;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "sam", 1000);
        Employee e2 = new Employee(102, "Pam", 1000);
        Employee e3 = new Employee(103, "Warren", 2000);
        Employee e4 = new Employee(104, "Elon", 3000);
        Employee e5 = new Employee(105, "Bill", 5000);

        Vector<Employee> vec = new Vector<>();

        vec.add(e1);
        vec.add(e2);
        vec.add(e3);
        vec.add(e4);
        vec.add(e5);

        Enumeration<Employee> enumeration = vec.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
