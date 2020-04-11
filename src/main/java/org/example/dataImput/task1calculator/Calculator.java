package org.example.dataImput.task1calculator;

import java.util.Scanner;

public class Calculator {
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public static void main(String[] args) {
        double x;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Wybierz jaki wyrażenie chcesz wykonać  +, - , * , ' / ', ");
        String znak = sc.nextLine();
        System.out.println("Podaj pierwsza liczbą");
        x = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj drugą liczbą ");
        y = sc.nextDouble();
        sc.nextLine();
        CalculateSwitch calculateSwitch = new CalculateSwitch();
        System.out.println(calculateSwitch.addcalc(x, y, znak));
    }
}

