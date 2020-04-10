package org.example.accessSpecifiers.dataPackage.task4;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int maxNumber = 5000;
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(maxNumber);

        orBigger(maxNumber, randomNumber);
        System.out.println(randomNumber);
        orEven(randomNumber);
        System.out.println(getDigital(randomNumber));
    }

    private static void orBigger(int maxNumber, int randomNumber) {
        if (randomNumber > maxNumber) {
            System.out.println("wylosowana liczba jest większa od :" + maxNumber);
        } else if (randomNumber == maxNumber) {
            System.out.println("wylosowana liczba jest równa: " + maxNumber);
        } else System.out.println("wylosowana liczba jest mniejsza od " + maxNumber);
    }

    private static int getDigital(int randomNumber23) {
        if (randomNumber23 / 1000 != 0)
            return randomNumber23;
        else if (randomNumber23 / 100 != 0)
            return randomNumber23 * 10;
        else if (randomNumber23 / 10 != 0)
            return randomNumber23 * 100;
        else
            return randomNumber23 * 1000;

    }

    private static void orEven(int randomNumber) {
        if (randomNumber % 2 == 0) {
            System.out.println("liczba parzysta");
        } else System.out.println("liczba nieparzysta");

    }
}
