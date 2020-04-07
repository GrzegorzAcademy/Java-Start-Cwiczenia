package org.example.aggregation.task1;

public class Person {
    private String firstName;
    private String lastName;
    private String pessel;
    private int age;
     Adress adressRegisted;
     Adress adressLiving;

    public Person(String firstName, String lastName, String pessel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pessel = pessel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPessel() {
        return pessel;
    }

    public void setPessel(String pessel) {
        this.pessel = pessel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
