package org.example.comparsion.computerShop;

public class DataStore {
    private int compNumber = 0;
    private static final int MAX_COMP_NUMBER = 100;
    private Computer[] computers = new Computer[MAX_COMP_NUMBER];

    public Computer[] getComputers() {
        Computer[] comps = new Computer[compNumber];
        for (int i = 0; i < compNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }
    void add(Computer computer) {
        if (compNumber < MAX_COMP_NUMBER) {
            computers[compNumber] = computer;
            compNumber++;
        } else System.out.println("Magazyj jest już pełen, prosze zwolnić " +
                "magazyn by dodawać kolejna pozycje");
    }

    int checkAvalibity(Computer comp2) {
        int numbersComputersEquals = 0;
        for (int i = 0; i <compNumber ; i++) {
            if(comp2.equals(computers[i]))
           numbersComputersEquals++;

        }return  numbersComputersEquals;
    }
}

