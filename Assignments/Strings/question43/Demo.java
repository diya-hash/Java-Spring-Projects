package Assignments.Strings.question43;

import java.util.Stack;

public class Demo {

    public static int calculateLength(String str) {
        int l = 0;
        try {
            while (true) {
                str.charAt(l);
                l++;
            }
        } catch (IndexOutOfBoundsException e) {
            return l;
        }
    }

    public static void main(String[] args) {
        String str = "Hello how are you Shyam";
        int len = calculateLength(str);
        System.out.println(len);
    }
}
