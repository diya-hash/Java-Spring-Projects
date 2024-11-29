package Assignments.collections.question60;

import java.util.ArrayList;

import Assignments.OOP.Employee;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "sam", 1000);
        Employee e2 = new Employee(102, "Pam", 1000);
        Employee e3 = new Employee(103, "Warren", 2000);
        Employee e4 = new Employee(104, "Elon", 3000);
        Employee e5 = new Employee(105, "Bill", 5000);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Id: " + list.get(i).getId() + "\t Name: " + list.get(i).getName() + "\t Salary: "
                    + list.get(i).getSal());
        }
    }
}
