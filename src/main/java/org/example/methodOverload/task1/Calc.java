package org.example.methodOverload.task1;

public class Calc {
    double add(double x, double y,double z){
        return x+y+z;
    }
    double add(double x,double y){
        return x+y;
    }
    double substract (double x,double y,double z){
        return x-y-z;
    }
    double substract(double x, double y){
        return x-y;
    }
}
