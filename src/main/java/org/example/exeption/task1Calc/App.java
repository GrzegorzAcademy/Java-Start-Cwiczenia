package org.example.exeption.task1Calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public static void main(String[] args) {
        String sign;
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;

        System.out.println("     Menu  ");
        System.out.println("Specify what action you want to perform +,-,*,/ ");
        sign = sc.nextLine();
        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Enter the first number");
                x = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the second number ");
                y = sc.nextDouble();
                sc.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid data entered");
                sc.nextLine();
            }
        }
        Calculate calculate = new Calculate();
        try {
            double result = (calculate.calculator(x, y, sign));
            System.out.println(x +" "+sign + " "+ y+ " " + " = "+ result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
