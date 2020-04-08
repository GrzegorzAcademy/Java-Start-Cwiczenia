package org.example.accessSpecifiers.dataPackage.task1.logic;

import org.example.accessSpecifiers.dataPackage.task1.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2015,"Audi","A5","Purple");
        Car audiA4 = new Car(2011,"Audi","A4");
        audiA4.setColor("Pink");
        audiA5.setYear(-1000);
        System.out.println(audiA4.getBrand() + " " + audiA4.getModel()+ " "+ audiA4.getYear() +  " " + audiA4.getColor());
        System.out.println(audiA5.getBrand() + " " + audiA5.getModel()+ " "+ audiA5.getYear()+ " "
        +audiA5.getColor());
    }
}
