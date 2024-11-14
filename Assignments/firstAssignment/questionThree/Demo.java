package Assignments.firstAssignment.questionThree;

import Assignments.firstAssignment.Employee;

public class Demo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("sam");
        e.setSal(1000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }

}
