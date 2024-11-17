package Assignments.firstAssignment.question29;

public class Demo {
    public static float m1(int i) {
        System.out.println("m1 called");
        return i * i;
    }

    public static void main(String[] args) {
        float output = m1(4);
        float total = 100 + output;
        System.out.println(total);
    }
}
