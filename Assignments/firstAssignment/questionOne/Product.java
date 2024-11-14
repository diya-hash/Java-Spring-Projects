package Assignments.firstAssignment.questionOne;

public class Product {
    int id;
    String name;
    int price;

    public Product() {

    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Product p = new Product(102, "Corn", 4);
        System.out.println("Id: " + p.id);
        System.out.println("Name: " + p.name);
        System.out.println("Price: " + p.price);
    }
}
