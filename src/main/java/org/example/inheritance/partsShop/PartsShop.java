package org.example.inheritance.partsShop;

public class PartsShop {
    public static void main(String[] args) {

        ExhaustPart exhaustPart = new ExhaustPart("Tłumik", " loud", "V", 12, "VI");
        Tire tire = new Tire("Michelin", "Winter", "1", 12, 225, 40, 18);
        System.out.println(tire.toString());
        System.out.println(exhaustPart.toString());


    }
}
