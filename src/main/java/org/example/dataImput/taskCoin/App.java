package org.example.dataImput.taskCoin;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Wybierz 1 revers ");
        System.out.println(" Lub 2 avers ");
        int userChoice;
        int flipResult;
        do {
        userChoice = sc.nextInt();
        flipResult = random.nextInt(2);
        if (userChoice == flipResult) {
            if (userChoice == 1) {
                System.out.println("wygrywasz");
            } else {
                System.out.println("wygrywasz");
            }
        } else {
            System.out.println("przegrałeś");
        }
    }while (userChoice!=flipResult);
}
}