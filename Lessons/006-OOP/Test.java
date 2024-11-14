public class Test extends Demo {
    int b = 10;

    public Test() {
        super();
        System.out.println("Child zero");
    }

    public Test(int num) {
        this();
        b = num;
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}