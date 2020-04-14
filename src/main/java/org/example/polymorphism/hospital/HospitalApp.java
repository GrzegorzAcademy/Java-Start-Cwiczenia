package org.example.polymorphism.hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
    hospital.add(new Nurse("Anna","Nowak",2500,100));
    hospital.add(new Nurse("Asia","Krawczyk",2600,101));
    hospital.add(new Doctor("Roman","Zagórski",30050,1000));

        System.out.println(hospital.printInfo());
    }
}
