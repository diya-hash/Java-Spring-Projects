package Assignments.firstAssignment.question34;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter Id: ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();

        System.out.println("Enter Name: ");
        scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Enter Salary: ");
        scan = new Scanner(System.in);
        int salary = scan.nextInt();

        Demo d = new Demo();
        d.show(id, name, salary);
    }

    public void show(int id, String name, int sal) {
        System.out.println("Id: " + id + " Name: " + name + " Salary: " + sal);
    }
}
