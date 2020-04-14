package org.example.typEnum.shop;

public enum Status {
    NEW("Złożono zamówenie ale jeszcze nie zostao opłacobe"),
    PAID("Zamówienie opłacono"),
    SHIPPED("Zamównienie wysłane"),
    DELIVERED("Zamówienie dostarczone"),
    CANCELLED("Zamówienie anulowano");
    private String discription;

    Status(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "discription = " + discription ;
    }
}
