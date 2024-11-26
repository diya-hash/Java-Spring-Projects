package Assignments.Strings.question42;

public class Demo {
    public static void main(String[] args) {
        String str = "Hello how are you Shyam";
        int count = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                count++;

            }
        }
        System.out.println(count);
    }
}
