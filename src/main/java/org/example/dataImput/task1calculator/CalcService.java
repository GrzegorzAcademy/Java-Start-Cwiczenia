package org.example.dataImput.task1calculator;

public class CalcService {
    double x;
    double y;

    double add(double x, double y) {
        return  x + y;

    }

    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        if (y<=0) {
            System.out.println(" Nie można dzielić przez zero podaj inne liczby");
        }
        double result = x/y;
        return result;
    }
}
