package Assignments.OOP.question51;

interface simCard {
    void sms();

    void call();
}

class Test implements simCard {
    public void sms() {
        System.out.println("This is the simcard");
    }

    public void call() {
        System.out.println("this is the call method");
    }
}

public class Demo extends Test {
    public static void main(String[] args) {
        Test t = new Demo();
        t.sms();
        t.call();
    }
}