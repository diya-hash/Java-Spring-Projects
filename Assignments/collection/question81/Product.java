package Assignments.collection.question81;

import java.util.HashSet;
import java.util.TreeSet;

public class Product implements Comparable {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Product e = (Product) o;
        if (this.getPrice() > e.getPrice()) {
            return -1;
        }
        if (this.getPrice() < e.getPrice()) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product("candle", 4, 10));
        productSet.add(new Product("candle", 4, 10));
        productSet.add(new Product("balloon", 1, 10));
        productSet.add(new Product("cake", 2, 100));

        TreeSet<Product> tSet = new TreeSet<>(productSet);
        productSet.clear();
        productSet.addAll(tSet);
        for (Product p : productSet) {
            System.out.println(p.getName());
        }
    }
}
