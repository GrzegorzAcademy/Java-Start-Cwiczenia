package org.example.loops.hospital;

public class Patient {
    private String firstname;
    private String lastName;
    private String peesel;

    public Patient() {
    }

    public Patient(String firstname, String lastName, String peesel) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.peesel = peesel;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeesel() {
        return peesel;
    }

    public void setPeesel(String peesel) {
        this.peesel = peesel;
    }
}
