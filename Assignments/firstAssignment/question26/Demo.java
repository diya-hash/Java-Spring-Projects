package Assignments.firstAssignment.question26;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void m1(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        m1(e.getId());
    }

}
