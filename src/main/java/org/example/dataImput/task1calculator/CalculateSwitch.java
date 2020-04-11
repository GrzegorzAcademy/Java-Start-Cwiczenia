package org.example.dataImput.task1calculator;

import static org.example.dataImput.task1calculator.Calculator.*;

public class CalculateSwitch {
    Calculator calculator = new Calculator();
    double result;

    public double addcalc(double x, double y, String znak) {

        CalcService calcService = new CalcService();
        switch (znak) {
            case ADD:
                result = calcService.add(x, y);
                break;
            case SUBTRACT:
                result = calcService.subtract(x, y);
                break;
            case MULTIPLY:
                result = calcService.multiply(x, y);
                break;
            case DIVIDE:
                result = calcService.divide(x, y);
                break;
            default:
                System.out.println("podany znak nie pasuje do wzorca");
        }
        return result;
    }
}
