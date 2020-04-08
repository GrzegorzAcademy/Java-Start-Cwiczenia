package org.example.accessSpecifiers.task3;

public class Telophone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int chargeLevel;

    public Telophone(String brand, String model, int batteryCapacity,
                     int chargeLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
    void printInfo(){
        System.out.println("brand " +getBrand() + " model " + getModel() + " bateryCapacity "
        + getBatteryCapacity()+ " chargeLevel " + getChargeLevel() + " %");
    }
}
