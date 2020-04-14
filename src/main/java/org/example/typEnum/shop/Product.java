package org.example.typEnum.shop;

public class Product {
    private String nameProduct;
    private double price;
    Status status;

    public Product(String nameProduct, double price, Status status) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
