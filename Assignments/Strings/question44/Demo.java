package Assignments.Strings.question44;

public class Demo {
    public static void main(String[] args) {
        String str = "Hello Welcome";
        boolean flag = false;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                flag = true;
            }
            if (flag == true && str.charAt(i) == 'l') {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
