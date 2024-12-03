package Assignments.collection.question80;

import java.util.HashSet;
import java.util.TreeSet;

import Assignments.collection.question72.Employee;

public class Demo {
    public static void main(String[] args) {
        HashSet<Employee> setEmployee = new HashSet<>();
        setEmployee.add(new Employee(101, "sam", 1000));
        setEmployee.add(new Employee(102, "sameer", 2000));
        setEmployee.add(new Employee(103, "shyam", 3000));
        setEmployee.add(new Employee(105, "ramesh", 5000));
        setEmployee.add(new Employee(105, "ramesh", 5000));
        setEmployee.add(new Employee(106, "sameera", 6000));

        TreeSet<Employee> EmTset = new TreeSet<>(setEmployee);
        setEmployee.clear();
        setEmployee.addAll(EmTset);
        for (Employee e : setEmployee) {
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }
    }
}
