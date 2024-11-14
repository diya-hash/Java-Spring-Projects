package Assignments.firstAssignment.questionEight;

import Assignments.firstAssignment.Employee;

public class Demo {

    public static void show(Employee ex) {
        System.out.println("Id: " + ex.getId() + " Name: " + ex.getName() + " Salary: " + ex.getSal());
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "same", 1000);
        Demo.show(emp);
        System.out.println("Id: " + emp.getId() + "Name: " + emp.getName() + "Salary: " + emp.getSal());
    }

}
/*
 * Output:
 * Id: 101Name: sameSalary: 1000
 * Id: 101Name: sameSalary: 1000
 */
