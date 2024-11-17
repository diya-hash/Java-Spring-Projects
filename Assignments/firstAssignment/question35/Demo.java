package Assignments.firstAssignment.question35;

public class Demo {
    static int total = 0;

    public static void add() {
        int total = 10 + 30;
    }

    public static void main(String[] args) {
        Demo.add();
        System.out.println(total);
    }
}
// output = 0 ; cause the total that I get as a result is the global static
// variable
// and the add method's variable - total is declared as the method variable and
// doesn't update the global variable - total.