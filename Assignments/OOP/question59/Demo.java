package Assignments.OOP.question59;

public class Demo {
    public static void main(String[] args) {
        String s = new String("string object");
        s = null;
        System.gc();
        System.out.println("Main completes");
    }

    public void finalize() {
        System.out.println("finalize method overriden");
    }
}
