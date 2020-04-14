package org.example.typEnum.shop;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Product[] productFilters;
        products[0] = new Product(" Komputer Apple MacBook Pro 2018", 4999, Status.CANCELLED);
        products[0] = new Product(" Telefon komórkowy Apple I Phone 8 ", 4999, Status.DELIVERED);
        products[0] = new Product(" Telewizor ", 999, Status.CANCELLED);
        products[0] = new Product(" Kino domowe", 499, Status.NEW);
        products[0] = new Product(" Słuchawki", 9, Status.PAID);
    }
// TODO
    private static void printProductsOther(Product[] FilterdProducts, Status status) {
        System.out.println("Lista zamówień ze statusem " + status);

    }

}
