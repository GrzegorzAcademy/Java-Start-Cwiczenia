package org.example.table.task1createTable;

public class App {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {5, 6, 7, 8};
        System.out.println(tab1[0]);
        int result = tab1[0] + tab1[1] + tab1[2] + tab1[3] + tab2[0] + tab2[1] + tab2[2] + tab2[3];
        System.out.println(result);

        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.println(arrayUtils.addTable(tab1, tab2));


    }
}
