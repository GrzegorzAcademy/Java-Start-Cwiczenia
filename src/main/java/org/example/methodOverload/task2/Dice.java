package org.example.methodOverload.task2;

import java.util.Random;

public class Dice {
    int area;
void randomRoll() {
    Random random = new Random();
    area = random.nextInt(6)+1;
}

    public Dice(int area) {
        this.area = area;
    }

    public Dice() {
    }
    void printInfo(){
        System.out.println( "liczba oczek , która wygadla to : " + area);
    }
}
