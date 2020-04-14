package org.example.polymorphism.hospital;

public class Person {
    private String firstName;
    private String lastname;
    private double salary;

    public Person(String firstName, String lastname, int salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    String printInfo(){
        return "Imię : " + firstName + ", Nazwisko : " +lastname
                +", wyplata : "+salary;
    }
}
