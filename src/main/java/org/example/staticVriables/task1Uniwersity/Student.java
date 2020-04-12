package org.example.staticVriables.task1Uniwersity;

public class Student {
    private String firstName;
    private String lastName;
    private int number;
    private static int studentsNumber;


    public Student(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        studentsNumber++;
    }

    public Student() {
    }

    public int getStudentsNumber() {
        return studentsNumber;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
