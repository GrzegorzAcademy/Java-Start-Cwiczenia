package org.example.methods.task2;

public class MetricCalculate {
static final int meter = 100;

    double meterPerCentimetr(double x){
        return x*meter;
    }
    double meterPerMilimeter(double x){
        return x*10*meter;
    }
    double centyPerMeter(double x){
        return x/meter;
    }
    double milimeterPerMeter(double x){
        return x/meter/meter;
    }

}
