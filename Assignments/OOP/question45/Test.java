package Assignments.OOP.question45;

public class Test extends Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        Test t = new Test();
        t.m1();
        t.m2();
        t.m3();
        // t.m4(); cannot call this method as it is a private method
    }
}