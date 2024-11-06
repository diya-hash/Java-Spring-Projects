public class Employee {
    String name;
    int id;
    static int x = m1();
    static String cname;

    static {
        System.out.println("hello from static block");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
    }

    private static int m1() {
        System.out.println("static var is printed");
        return 10;
    }
}