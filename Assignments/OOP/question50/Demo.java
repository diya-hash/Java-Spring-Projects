package Assignments.OOP.question50;

interface iDemo {
    void m1();

    int m2(int x);
}

public class Demo implements iDemo {
    public void m1() {
        System.out.println("Method from interface A");
    }

    public int m2(int x) {
        System.out.print("Printing x: ");
        return x;
    }

    public static void main(String[] args) {
        Demo b = new Demo();
        b.m1();
        System.out.println(b.m2(101));
    }
}
