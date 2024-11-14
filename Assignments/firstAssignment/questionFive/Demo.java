package Assignments.firstAssignment.questionFive;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void show(Employee e) {
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        show(e);
    }

}
