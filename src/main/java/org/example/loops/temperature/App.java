package org.example.loops.temperature;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double temp1;
        double temp2;

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj temperaturę jaką chcesz osiągnąć ");
        temp1 = sc.nextDouble();
        System.out.println("podaj aktualną temperature otoczenia ");
        temp2 = sc.nextDouble();


        while (temp1 > temp2) {
            temp2 = temp2 +0.5;
            System.out.println("Aktulana twemperatura "+temp2);
        }while (temp1<temp2) {
            temp2 = temp2-0.5;
            System.out.println(" Aktualna temperatura "+temp2);

        }



    }
}
