package org.example.methods.task3;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product("Czekolada Mleczna", "Milka");
        Offer offer1 = new Offer(3.99, true);
       offer1.product = product1;
        offer1.printInfo();
    }
}
