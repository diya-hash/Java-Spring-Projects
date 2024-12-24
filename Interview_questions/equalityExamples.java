public class equalityExamples {
    public static void main(String[] args) {
        String s1 = "sam";
        String s2 = "sam";
        String s3 = new String("sam");
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2));// true
        System.out.println(s3 == s1); // false
        System.out.println(s3.equals(s1)); // true

        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2); // true
        System.out.println(num1.equals(num2)); // true

        boolean isTrue = false;
        if (isTrue = true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // output : True
    }
}