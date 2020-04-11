package org.example.table.task2elevator;

public class ElevatorService {
    public static void main(String[] args) {
        Person person1 = new Person(1,100);
        Person person2 = new Person(2,110);
        Person person3 = new Person(3,100);
        Person person4 = new Person(4,100);
        Person person5 = new Person(4,100);


        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
        elevator.start();
        elevator.clear();
        elevator.start();
        elevator.add(person1);
        elevator.add(person2);
    }
}
