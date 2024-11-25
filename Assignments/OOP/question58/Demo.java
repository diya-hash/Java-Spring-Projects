package Assignments.OOP.question58;

import java.lang.Object;
import Assignments.OOP.Employee;

public class Demo implements Cloneable {
    int a = 100;

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo d = new Demo();
        Demo d1 = (Demo) d.clone();
        System.out.println(d1.a);
    }
}
// This is shallow cloning