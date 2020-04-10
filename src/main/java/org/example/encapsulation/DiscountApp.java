package org.example.encapsulation;

public class DiscountApp {
    public static void main(String[] args) {
        double price = 1100;

        Person person = new Person("Jan ", "Kowalski", true);
        DiscountService discountService = new DiscountService();
        double calculatediscoutPrice1 = discountService.calculatediscoutPrice(person, price);

        double price2 = 1100;
        Person person2 = new Person("Kasia", "Przetakiewicz", false);
        double calculatediscoutPrice2 = discountService.calculatediscoutPrice(person2, price2);

        PrintService printService = new PrintService();
        printService.printSumary(person, price, calculatediscoutPrice1);
        printService.printSumary(person2, price2, calculatediscoutPrice2);
    }
}
