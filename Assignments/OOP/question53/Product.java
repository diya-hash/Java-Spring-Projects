package Assignments.OOP.question53;

public class Product {
    int id;
    String name;
    int price;
    int quantity;

    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void toString(Product p) {
        System.out.println(p.id + "\t" + p.name + "\t" + p.price + "\t" + p.quantity);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "sam", 35, 1);
        p.toString(p);
    }
}
