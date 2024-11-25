package Assignments.OOP.question48;

public class C extends A {

    @Override
    public void show() {
        System.out.println("method implemented from abstract class C");
    }

    public static void main(String[] args) {
        A a = new C();
        System.out.println(a.m1(10));
    }

}
// cannot extend abstract class A & B but just either A or B because they both
// contain same non-abstract method (m1) with the same logic and method
// signature
