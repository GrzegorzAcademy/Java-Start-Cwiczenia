package org.example.operationsOnTheText.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj napis ");
        String world = scanner.nextLine();

        if (Character.isUpperCase(world.charAt(0))) {
            System.out.println(world.toUpperCase());

        } else System.out.println(world.toLowerCase());
    }
}
