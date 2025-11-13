package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15", "10.03.2025", "Apple Inc.", "USA", 6999, false);
        productsArray[2] = new Product("Xiaomi Mi 11", "15.01.2025", "Xiaomi", "China", 3499, true);
        productsArray[3] = new Product("Sony WH-1000XM4", "05.05.2024", "Sony", "Japan", 1299, false);
        productsArray[4] = new Product("Dell XPS 13", "20.12.2024", "Dell", "USA", 8999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}