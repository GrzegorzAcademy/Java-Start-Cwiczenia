package org.example.methods.task1;

public class Calculator {
    public static void main(String[] args) {

       Calculate calculate = new Calculate();
        System.out.println( calculate.add(3,6));
        System.out.println(calculate.divide(3,0));
        System.out.println(calculate.multiply(3,6));
        System.out.println(calculate.substract(3,0));

    }
}
