package org.example.exeption.task1Calc;

import static org.example.exeption.task1Calc.App.*;

public class Calculate {
    static CalcDate calcDate = new CalcDate();

    public double calculator(double x, double y, String sign) throws UnknownOperatorException {
        double result;
        switch (sign) {
            case ADD:
                result = calcDate.add(x, y);
                break;
            case SUBTRACT:
                result = calcDate.subtract(x, y);
                break;
            case MULTIPLY:
                result = calcDate.multiply(x, y);
                break;
            case DIVIDE:
                if(y==0)
                throw  new ArithmeticException("cannot be divided by zero");
                result = calcDate.divide(x, y);
                break;
            default:
                throw new UnknownOperatorException("Unexpected value: " + sign);
        }
        return result;
    }
}