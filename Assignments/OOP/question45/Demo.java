package Assignments.OOP.question45;

public class Demo {
    void m1() {
        System.out.println("this is default method");
    }

    public void m2() {
        System.out.println("this is public method");
    }

    protected void m3() {
        System.out.println("this is protected method");
    }

    private void m4() {
        System.out.println("this is private method");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
        d.m2();
        d.m3();
        d.m4();
    }

}
