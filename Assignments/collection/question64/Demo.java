import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(7);
        al.add(9);
        al.sort(null);
        System.out.println(al);
    }
}
