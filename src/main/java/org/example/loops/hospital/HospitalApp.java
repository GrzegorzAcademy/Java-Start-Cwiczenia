package org.example.loops.hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EXIT = 0;
        final int ADD_PATIENTS = 1;
        final int PRINT_PATIENTS = 2;
        int option = -1;
        Hospital hospital = new Hospital();

        while (option != EXIT) {
            System.out.println(EXIT + " wyjście z programu  ");
            System.out.println(ADD_PATIENTS + " dodanie pacjenta ");
            System.out.println(PRINT_PATIENTS + " wyśwwietlanie listy pacjentów ");

            System.out.println("Wybierz opcję");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case ADD_PATIENTS:
                    Patient patient = new Patient();
                    System.out.println("Podaj imię");
                    patient.setFirstname(sc.nextLine());
                    System.out.println("Podaj nazwisko");
                    patient.setLastName(sc.nextLine());
                    System.out.println("Podaj PESSEL");
                    patient.setPeesel(sc.nextLine());
                    hospital.addPatients(patient);
                    break;
                case PRINT_PATIENTS:
                    hospital.printPatients();
                    break;
                case EXIT:
                    System.out.println("Zamykam Program");
                    break;
                default:
                    System.out.println("błędny wybór");
            }
        }

    }
}