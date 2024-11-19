package Lessons.Lesson_Abtraction;

public class Test extends Demo {
    int x = 101;
    int y = 800;

    public Test() {

    }

    public Test(int x) {
        super(x);
    }

    public void m1() {
        System.out.println("Print abstract class' x and y");
        System.out.println("implementing the abstract method in child class");
    }

    public static void main(String[] args) {
        Test t = new Test(100);
        t.m1();
        t.m2();
    }
}
