package org.example.methods.task2;

public class App {
    public static void main(String[] args){
    long x = 14;

        MetricCalculate metricCalculate = new MetricCalculate();
        TimeCalc timeCalc = new TimeCalc();
        double minToSec = timeCalc.minToSec(x);
        System.out.println(x + " minut to " + minToSec + " sekund ");
        double secPerMiliSec = timeCalc.secPerMiliSec(x);
        System.out.println(x + " sekund to " + secPerMiliSec  + " milisecund");
        double hourPerMin1 = timeCalc.hourPerMin(x);
        System.out.println(x + " godzin to " +hourPerMin1 + " minut " );
        long v = timeCalc.hourPerMin(x);
        long v1 = timeCalc.minToSec(v);
        long v2 = timeCalc.secPerMiliSec(v1);
        System.out.println("<<<<<>>>>>>");
        System.out.println(x + "godzin to : " + v2+ " milisekund");
        System.out.println("<<<<<>>>>>");

        double meterPerCentimetr = metricCalculate.meterPerCentimetr(x);
        System.out.println("metr to " + meterPerCentimetr + " centymetrów ");


    }
}
