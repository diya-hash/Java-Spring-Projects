package Assignments.Strings.question40;

public class Demo {
    public static void main(String[] args) {
        String str = "How are you Sam?";
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'o') {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

}
