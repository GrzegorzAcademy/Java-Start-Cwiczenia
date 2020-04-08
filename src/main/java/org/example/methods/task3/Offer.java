package org.example.methods.task3;

public class Offer {
    Product product;
    private double prince;
    private boolean special;

    public Offer(double prince, boolean special) {
        this.product = product;
        this.prince = prince;
        this.special = special;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
    void printInfo(){
        System.out.println(
                " Produkt " + product.getName()+ " name " + product.getProducer() +
                ", cena = " + prince +" promocja " + special );
    }
  }
