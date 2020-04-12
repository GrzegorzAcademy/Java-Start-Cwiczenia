package org.example.dataImput.taskCoin;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Wybierz 1 - revers ");
        System.out.println(" Lub 2 - avers ");
        int userChoice;
        int flipResult;
        do {
            flipResult = random.nextInt((2-1)+1)+1;
            userChoice = sc.nextInt();
                if (userChoice == flipResult) {
                    System.out.println("wygrywasz");
                } else {
                    System.out.println("przegrałeś");
                }
            }
            while (userChoice != flipResult) ;
        }
    }
