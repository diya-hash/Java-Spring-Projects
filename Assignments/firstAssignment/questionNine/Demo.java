package Assignments.firstAssignment.questionNine;

import Assignments.firstAssignment.Employee;

public class Demo {
    public static void show(Employee ex) {
        System.out.println("Id: " + ex.getId() + " Name: " + ex.getName() + " Salary: " + ex.getSal());
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        emp.setSal(1100);
        show(emp);
    }
}
