package org.example.exeption.task1Calc;

public class CalcDate {
    double result;

    public double add(double x, double y) {
        result = x + y;
        return result;
    }

    public double subtract(double x, double y) {
        result = x - y;
        return result;
    }

    public double multiply(double x, double y) {
        result = x * y;
        return result;
    }

    public double divide(double x, double y) {
        if (y < 0) {
            throw new  ArithmeticException();
        } else result = x/y;
        return  result;
    }
}
