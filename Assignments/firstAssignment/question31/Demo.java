package Assignments.firstAssignment.question31;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static Object m1() {
        Employee e = new Employee(101, "sam", 1000);
        return e;
    }

    public static void main(String[] args) {
        Object obj = (Employee) m1();
        System.out.println("ID: " + obj.getId());
        System.out.println("ID: " + obj.getName());
        System.out.println("salary: " + obj.getSal());
    }
}
