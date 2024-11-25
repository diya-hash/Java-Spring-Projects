package Assignments.OOP.question49;

abstract class Test {
    public abstract void show();
}

class Test1 extends Test {
    public void show() {
        System.out.println("Method from abstract class Test implemented in class Test1");
    }
}

public class Demo extends Test1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
