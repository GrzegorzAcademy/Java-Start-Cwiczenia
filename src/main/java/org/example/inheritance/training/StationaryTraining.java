package org.example.inheritance.training;

public class StationaryTraining extends  Training{
    private String city;
    private int time;

    public StationaryTraining(String identificaionSymbol, String name, int price, String city, int time) {
        super(identificaionSymbol, name, price);
        this.city = city;
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return " identificaionSymbol = " + getIdentificaionSymbol() +
                ", name = " + getName() +
                ", price = " + getPrice() +
                ", city = " + city  +
                ", time = " + time + ", discription :" + getDescription();
    }
}
