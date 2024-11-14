package Assignments.firstAssignment.questionFour;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }
}
