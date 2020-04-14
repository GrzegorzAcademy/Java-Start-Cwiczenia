package org.example.polymorphism.hospital;

public class Doctor extends Person{
    private double bonus;

    public Doctor(String firstName, String lastname, int salary, double bonus) {
        super(firstName, lastname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    String printInfo() {
        return super.printInfo()+ " Gratyfikacja : " + bonus + " zł";
    }
}

