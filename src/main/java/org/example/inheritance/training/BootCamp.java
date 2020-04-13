package org.example.inheritance.training;

public class BootCamp extends Training {
    private String nameTrainer;
    private String lastNameTrainer;
    private int consultationTime;

    public BootCamp(String identificaionSymbol, String name, int price, String nameTrainer, String lastNameTrainer, int consultationTime) {
        super(identificaionSymbol, name, price);
        this.nameTrainer = nameTrainer;
        this.lastNameTrainer = lastNameTrainer;
        this.consultationTime = consultationTime;
    }

    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public String getLastNameTrainer() {
        return lastNameTrainer;
    }

    public void setLastNameTrainer(String lastNameTrainer) {
        this.lastNameTrainer = lastNameTrainer;
    }

    public int getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(int consultationTime) {
        this.consultationTime = consultationTime;
    }

    @Override
    public String toString() {
        return " identificaionSymbol = " + getIdentificaionSymbol() +
                ", name = " + getName() +
                ", price = " + getPrice()  +
                " nameTrainer = " + nameTrainer  +
                ", lastNameTrainer = " + lastNameTrainer  +
                ", consultationTime = " + consultationTime;
    }
}
