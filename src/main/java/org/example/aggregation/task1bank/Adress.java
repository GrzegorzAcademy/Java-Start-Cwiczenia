package org.example.aggregation.task1bank;

public class Adress {
    private String city;
    private String street;
    private String nubrerOfHause;
    private String zipCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNubrerOfHause() {
        return nubrerOfHause;
    }

    public void setNubrerOfHause(String nubrerOfHause) {
        this.nubrerOfHause = nubrerOfHause;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return
                "city='" + city +
                ", street = " + street  +
                " , nubrerOfHause = " + nubrerOfHause  +
                " , zipCode = " + zipCode ;
    }
}
