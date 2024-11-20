package Assignments.OOP.question47;

public class B extends A implements C, D {

    public void m2() {
        System.out.println("Implementing parent's abstract method in child");
    }

    public int m4(int x) {
        return x;
    }

    public void m1() {
        System.out.println("method from interface C");
    }

    public int m2(int y) {
        System.out.println("Abstract method from interface C");
        return y;
    }

    public double m2(double x) {
        System.out.println("Abstract method from interface D");
        return x;
    }

    public String m3(String s) {
        System.out.println("Method in both C & D interfaces");
        return s;
    }

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.m1();
        a.m2();
        a.m3();
        System.out.println(a.m4(a.x));
    }
}
