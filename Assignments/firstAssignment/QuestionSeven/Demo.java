package Assignments.firstAssignment.questionSeven;

import Assignments.firstAssignment.Employee;

public class Demo {

    public static void show(Employee e1, Employee e2) {
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSal());
        System.out.println("\t");
        System.out.println("ID: " + e2.getId());
        System.out.println("Name: " + e2.getName());
        System.out.println("Salary: " + e2.getSal());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "sam", 1000);
        Employee e2 = new Employee(102, "Pam", 1005);
        show(e1, e2);
    }
}
