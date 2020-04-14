package org.example.polymorphism.hospital;

public class Hospital {
    Person[] people = new Person[MAX_PEOPLE];
    private static final int MAX_PEOPLE = 3;
    int personNumber = 0;

    public void add(Person person) {
        if (personNumber<MAX_PEOPLE)
            people[personNumber] = person;
        personNumber++;
    }
    String printInfo(){
        String result = "";
        for (int i1 = 0; i1 < personNumber; i1++) {
            result = result + people[i1].printInfo() +"\n";
        }
        return result;
    }

}
