package org.example.typEnum.pizzeria;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println(" Dostępne pizze" );
        for (Pizza pi: Pizza.values()){
            System.out.println(pi);
        }
        System.out.println(" Jaką pizzę wybierasz ");
        Scanner scanner = new Scanner(System.in);
        Pizza choise = Pizza.valueOf(scanner.nextLine().toUpperCase());
        System.out.println(" Gratuacje wybrałeś " + choise.name() +"\n"
                + "Dziekujemy za złożenia zamówienia" );
    }

}
