package org.example.exeption.task2Competetions;

import org.example.exeption.task2Competetions.exeption.AgeViolationException;
import org.example.exeption.task2Competetions.exeption.DuplicateException;
import org.example.exeption.task2Competetions.exeption.MaxCompetitorsException;

import java.util.InputMismatchException;
import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = scanner.nextInt();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                System.out.println("Addition not possible, the minimum " +
                        "age has not been reached");
            } catch (DuplicateException e) {
                System.out.println("user with id" + participant.getDocumentId() + " already exists");
            } catch (MaxCompetitorsException e) {
                System.out.println("the maximum number of users has " +
                        "already been reached, no new user has been added");
            }
        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number < 0) {
            try {
                number = scanner.nextInt();
                if (number < 0)
                    System.out.println("Number must be positive ");
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number try again");
            } finally {
                scanner.close();
            }
        }
        return number;
    }
}

