package Assignments.firstAssignment.question28;

public class Demo {
    public static int m1(int i) {
        System.out.println("m1 called");
        return i * i;
    }

    public static void main(String[] args) {
        int output = m1(4);
        int total = 100 + output;
        System.out.println(total);
    }
}
