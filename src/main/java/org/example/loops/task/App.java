package org.example.loops.task;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("podaj liczbę do sprawdzenia");
            int numbers = sc.nextInt();
            if (numbers % 2 == 0) {
                System.out.println("liczba " +  numbers + " jest parzysta");
            } else
                System.out.println("liczba " + numbers+ " jest nieparzysta");
        }
    }
}