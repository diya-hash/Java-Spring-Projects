package Assignments.firstAssignment.question24;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void m1(Employee e) {
        System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSal());
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        m1(e);
    }
}
