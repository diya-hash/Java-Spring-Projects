package Assignments.firstAssignment.question32;

public class Demo {
    public static int m1(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        int output = m1(5);
        System.out.println(output);
        System.out.println(m1(6));
        Demo d = new Demo();
        output = d.m1(9);
        System.out.println(output);

    }

}
