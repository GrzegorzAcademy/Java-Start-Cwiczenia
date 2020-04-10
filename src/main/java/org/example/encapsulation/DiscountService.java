package org.example.encapsulation;

public class DiscountService {
    public double calculatediscoutPrice(Person person, double price) {
        if (person.isClientPremium()) {
            return calculatePremiumDiscount(price);
        } else return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000)
            return aplydiscount(price,0.1);
        else return price;
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return aplydiscount(price,0.15);
        } else return aplydiscount(price,0.05);
    }
    double aplydiscount(double price , double discount){
        return price = price*(1-discount);
    }
}

