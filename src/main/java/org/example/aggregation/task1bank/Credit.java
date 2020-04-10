package org.example.aggregation.task1bank;

public class Credit {
    Person debtor;
    private double caschCredit;
    private double interest;
    private int peroid;
    private int time;

    public double getCaschCredit() {
        return caschCredit;
    }

    public void setCaschCredit(double caschCredit) {
        this.caschCredit = caschCredit;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getPeroid() {
        return peroid;
    }

    public void setPeroid(int peroid) {
        this.peroid = peroid;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}


