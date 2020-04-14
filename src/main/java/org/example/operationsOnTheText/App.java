package org.example.operationsOnTheText;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość słów do wczyrtania");
        int numbersOfWords = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[numbersOfWords];
        for (int i = 0; i <numbersOfWords ; i++) {
            System.out.println("Podaj słowo");
            strings[i] = sc.nextLine();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbersOfWords; i++) {
            stringBuilder.append(strings[i].charAt(strings[i].length()-1));
        }
        System.out.println(" nowe słowo "+ stringBuilder.toString());



//        String sentence = "Ala;ma;kota;kot;ma;ale";
//        String sentenceTrim = sentence.trim();
//        System.out.println(sentenceTrim);
//        String[] split = sentenceTrim.split(";");
//        System.out.println(split.length-1);
    }
}
