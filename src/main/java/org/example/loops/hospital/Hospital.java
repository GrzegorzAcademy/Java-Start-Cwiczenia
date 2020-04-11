package org.example.loops.hospital;

public class Hospital {
    private final int maxPatientsNumber = 2;
    private int regPatients;
    private Patient[] patients = new Patient[maxPatientsNumber];
    Patient patient = new Patient();

    public void addPatients(Patient patient) {
        if (maxPatientsNumber <regPatients) {
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("liczba pacjentów przekracza maksymalną");
        }
    } void printPatients(){
        for (int i = 0; i <regPatients ; i++) {
            System.out.println(patients[i].getFirstname()+ " "
                    + patients[i].getLastName() + " " + patients[i].getPeesel());
        }
    }
}
