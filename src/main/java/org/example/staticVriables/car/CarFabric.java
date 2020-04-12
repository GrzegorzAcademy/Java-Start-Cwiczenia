package org.example.staticVriables.car;

public class CarFabric {
    public static void main(String[] args) {
        Car car = new Car(10,true,true,false,false);
        System.out.println(car.status());
Car car1 = new Car(20,true,false,true,true);
        System.out.println(car1.status());
    }
}
