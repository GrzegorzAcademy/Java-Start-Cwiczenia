package org.example.inheritance.training;

public class Training {
    private String identificaionSymbol;
    private String name;
    private int price;
    private String description;

    public Training(String identificaionSymbol, String name, int price) {
        this.name = name;
        this.identificaionSymbol = identificaionSymbol;
        this.price = price;
    }

    public String getIdentificaionSymbol() {
        return identificaionSymbol;
    }

    public void setIdentificaionSymbol(String identificaionSymbol) {
        this.identificaionSymbol = identificaionSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " identificaionSymbol = " + identificaionSymbol + '\'' +
                ", name = " + name +
                ", price = " + price;
    }
}
