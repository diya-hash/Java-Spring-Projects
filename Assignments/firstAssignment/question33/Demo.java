package Assignments.firstAssignment.question33;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void show(Employee e) {
        System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSal());
    }

    public static void process(Employee e, int id, String name, int sal) {
        e.setId(id);
        e.setName(name);
        e.setSal(sal);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        process(e, 101, "sam", 1000);
        show(e);
    }
}
