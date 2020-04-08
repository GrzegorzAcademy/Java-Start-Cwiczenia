package org.example.methods.task1;

public class Calculate {

    double add(double x, double y) {
        double result = x + y;
        return result;
    }

    double substract(double x, double y) {
        double result = x - y;
        return result;
    }

    double multiply(double x, double y) {
        double result = x * y;
        return result;
    }

    double divide(double x, double y) {
        if (y != 0) {
            double result = x / y;
            return result;
        } else System.out.println("nie można dzielić przez zero");
        return 0;
    }
}
