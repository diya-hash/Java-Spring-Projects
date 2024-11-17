package Assignments.firstAssignment.question13;

public class Demo {
    int x = 10;

    public void show() {
        int x = 100;
        System.out.println(x);

        Demo d = new Demo();
        System.out.println(d.x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
