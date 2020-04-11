package org.example.table.task2elevator.task3twoDimensionalArray;

public class App {
    public static void main(String[] args) {
        double[][] tab1 = new double[3][3];

        tab1[0][0] = 1.0;
        tab1[0][1] = 1.5;
        tab1[0][2] = 2.0;
        tab1[1][0] = 1.5;
        tab1[1][1] = 2.0;
        tab1[1][2] = 2.5;
        tab1[2][0] = 2.0;
        tab1[2][1] = 2.5;
        tab1[2][2] = 3.0;

        double sum1 = (tab1[0][0]*tab1[1][1]*tab1[2][2])+(tab1[2][0]*tab1[1][1]*tab1[0][2]);
        System.out.println(sum1);
        double sum2 = (tab1[0][1]+tab1[1][1]+tab1[1][2])*(tab1[0][1]+tab1[1][1]+tab1[2][1]);
        System.out.println(sum2);
        double sum3 = tab1[0][0]+tab1[1][0]+tab1[0][2]+tab1[1][2]+tab1[2][2]+tab1[2][1]+tab1[2][0]+tab1[1][0];
        System.out.println(sum3);

    }
}