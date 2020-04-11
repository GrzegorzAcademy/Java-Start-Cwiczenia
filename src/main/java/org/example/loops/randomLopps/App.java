package org.example.loops.randomLopps;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile licz chcesz zsumować ");
        int numbers = sc.nextInt();
        int sum = 0;
        for (; numbers > 0; numbers--) {
            System.out.println("Podaj kolejną liczbę");
            sum = sum + sc.nextInt();

        }
        System.out.println("Suma wszystkich liczb to " + sum);
    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj ile liczb chcesz zliczyć");
//        int numbers = sc.nextInt();
//
//        int sum = 0;
//
//        while (numbers-- > 0) {
//            System.out.println("Podaj liczbe ");
//            sum = sum + sc.nextInt();
//
//        }
//        System.out.println("Suma wszystkich liczb to " + sum);
    // }
}
