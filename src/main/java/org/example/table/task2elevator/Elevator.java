package org.example.table.task2elevator;

public class Elevator {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;
    private int maxPeople = 4;

    void add(Person person) {
        if (peopleNumber < maxPeople) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else
            System.out.println("ilośc osób w windzie przekracza maksymalną ");
        }

    private boolean weightsCorrects() {
        return getTotelWeight() <= maxWeight;
    }

    public int getTotelWeight() {
        int totalWeight = 0;
        if (people[0] != null)
            totalWeight += people[0].getWeight();
        if (people[1] != null)
            totalWeight += people[1].getWeight();
        if (people[2] != null)
            totalWeight += people[2].getWeight();
        if (people[2] != null)
            totalWeight += people[3].getWeight();
        return totalWeight;
    }

    void start() {
        if (weightsCorrects()) {
            System.out.println("winda wystartowała");

        } else {
            int overload = getTotelWeight() - maxWeight;
            System.out.println("winda przeciążona o " + overload + "kg");
        }
    }

    void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        peopleNumber = 0;
        System.out.println("Winda pusta");
    }
}
