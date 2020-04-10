package org.example.aggregation.task3cinema;

public class Customer {
    private String firstName;
    private String lastName;
    private int age1;

    public Customer(String firstName, String lastName, int age1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age1 = age1;
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

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
