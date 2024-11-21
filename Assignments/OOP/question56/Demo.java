package Assignments.OOP.question56;

import Assignments.OOP.question53.Product;

public class Demo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "sam", 35, 1);
        Product p2 = new Product(101, "sam", 35, 1);

        if (p1 == p2)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
