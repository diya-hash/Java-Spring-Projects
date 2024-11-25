package Assignments.Strings.question37;

public class Demo {

    public static String reverseString(String str) {
        String nstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            nstr = nstr + str.charAt(i);
        }
        return nstr;
    }

    public static void main(String[] args) {
        String str = "Hello Welcome";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
}
