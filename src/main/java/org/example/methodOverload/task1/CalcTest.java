package org.example.methodOverload.task1;

public class CalcTest {
    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        double z = 2;
        Calc calc = new Calc();
        double addTwoNumbers = calc.add(x, y);
        double addThreeNumbers = calc.add(x, y, z);
        double substractTwoNumbers = calc.substract(x, y);
        double substractThreeNumbers = calc.substract(x, y, z);

        System.out.println(x + " + " + y + " = " + addTwoNumbers);
        System.out.println(x + " + " + y + " + " + z + " = " + addThreeNumbers);

        System.out.println(x + " - " + y + " = " + substractTwoNumbers);
        System.out.println(x + " - " + y + " - " + z + " = " + substractThreeNumbers);
    }
}
