package org.example.polymorphism.hospital;

public class Nurse extends Person {
    private int overtime;


    public Nurse(String firstName, String lastname, int salary, int overtime) {
        super(firstName, lastname, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    String printInfo() {
        return super.printInfo() + ", Nadgodziny : "+ overtime +" godzin ";
    }
}
