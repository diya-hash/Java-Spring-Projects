package Assignments.firstAssignment.question25;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void m1(Object o) {
        Employee e = (Employee) o;
        System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSal());
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        Object o = e;
        m1(o);
    }
}
