package org.example.methodOverload.task2;

public class Test {
    public static void main(String[] args) {
        Dice dice = new Dice(1);

        dice.randomRoll();
        dice.printInfo();
        dice.randomRoll();
        dice.printInfo();
        dice.randomRoll();
        dice.printInfo();
    }
}
