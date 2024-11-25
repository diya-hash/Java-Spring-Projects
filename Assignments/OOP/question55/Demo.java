package Assignments.OOP.question55;

import Assignments.OOP.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "sam", 1000);
        Employee e2 = new Employee(101, "sam", 1000);
        if (e1 == e2)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
