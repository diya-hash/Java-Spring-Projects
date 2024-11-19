package Lessons.Lesson_Abtraction;

public abstract class Demo {
    int x = 10;
    int y = 900;

    public Demo() {

    }

    public Demo(int x) {
        System.out.println("x: " + x);
    }

    public abstract void m1();

    public void m2() {
        System.out.println("Parent method which is not an abstract class");
    }
}
