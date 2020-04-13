package org.example.inheritance.training;

public class TraningOnline extends Training {
    private int numberOfVideoMinutes;
    private int estimatedLearningTime;


    public TraningOnline(String identificaionsymbol, String name, int price, int numberOfVideoMinutes, int estimatedLearningTime) {
        super(identificaionsymbol, name, price);
        this.numberOfVideoMinutes = numberOfVideoMinutes;
        this.estimatedLearningTime = estimatedLearningTime;
    }

    public int getNumberOfVideoMinutes() {
        return numberOfVideoMinutes;
    }

    public void setNumberOfVideoMinutes(int numberOfVideoMinutes) {
        this.numberOfVideoMinutes = numberOfVideoMinutes;
    }

    public int getEstimatedLearningTime() {
        return estimatedLearningTime;
    }

    public void setEstimatedLearningTime(int estimatedLearningTime) {
        this.estimatedLearningTime = estimatedLearningTime;
    }

    @Override
    public String toString() {
        return " identificaionSymbol = " + getIdentificaionSymbol() +
                ", name = " + getName() +
                ", price = " + getPrice() + ", numberOfVideoMinutes = " + numberOfVideoMinutes +
                ", estimatedLearningTime = " + estimatedLearningTime +
         ", description " + getDescription();
    }
}
