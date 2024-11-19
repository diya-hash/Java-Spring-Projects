package Assignments.secondAssignment.question39;

public class Demo {
    public static void main(String[] args) {
        String str = "How are you Sam?";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
