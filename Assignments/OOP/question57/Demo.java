package Assignments.OOP.question57;

import Assignments.OOP.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "sam", 1000);
        Employee e2 = new Employee(101, "sam", 1000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
    // implemented the overriden equals method in the Employee Class under the OOP
    // folder.
}
