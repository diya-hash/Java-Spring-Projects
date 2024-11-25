package Assignments.OOP.question47;

public abstract class A {
    int x = 10;
    private int y = 101;

    public void m1() {
        System.out.println("public method in parent class");
    }

    public abstract void m2();

    void m3() {
        System.out.println("this default method in parent class");
    }

    protected abstract int m4(int a);
}
