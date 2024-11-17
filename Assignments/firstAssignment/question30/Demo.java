package Assignments.firstAssignment.question30;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static Employee m1() {
        Employee e = new Employee(101, "sam", 1000);
        return e;
    }

    public static void main(String[] args) {
        Employee e = m1();
        System.out.println("Id: " + e.getId());
        System.out.println("NameL " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }
}
