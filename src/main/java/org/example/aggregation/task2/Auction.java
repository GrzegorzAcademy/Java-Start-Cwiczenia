package org.example.aggregation.task2;

public class Auction {
    private String title;
    private String distcription;
    private double price;
    User seller;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDistcription() {
        return distcription;
    }

    public void setDistcription(String distcription) {
        this.distcription = distcription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
