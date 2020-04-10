package org.example.aggregation.task3cinema;


import org.example.encapsulation.Person;

class CinemaSystem {
    public static void main(String[] args) {
        Move move1 = new Move("Omen", "horror", 128, 16, 72,72);
        int freeSeats = 72;
        Customer customer1 = new Customer("Jan", "Kowalski", 15);
        int ticket1Id = 0;
        String ticket1PersonData = null;
        Move ticket1MovieTitle = null;

        if (freeSeats == 0) {
            System.out.println("Brak wolnych miejsc na seans");
   //     } else if (customer1.getAge1() < move1.ageRequired) {
  //          System.out.println("Film dostępny dla osób powyżej " + move1.ageRequired + " lat");
        } else {
            ticket1Id = 1;
            ticket1PersonData = customer1.getFirstName() + " " + customer1.getLastName();
            ticket1MovieTitle = move1;
            freeSeats--;
        }

        Customer customer2 = new Customer("Anna", "Zalewska", 19);
        int ticket2Id = 0;
        String ticket2PersonData = null;
        Move ticket2MovieTitle = null;

        if (freeSeats == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (customer2.getAge1() < move1.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + move1.getAgeRequired() + " lat");
        } else {
            ticket2Id = ticket1Id + 1;
            ticket2PersonData = customer2.getFirstName() + " " + customer2.getLastName();
            ticket2MovieTitle = move1;
            freeSeats--;
        }

        System.out.println("Sprzedane bilety");
        if (ticket1Id != 0) {
   //         System.out.println(ticket1Id + " | " + ticket1PersonData + " | " + ticket1MovieTitle + " - " + movieType + " - " + movieTime + "min");
        }
 //       if (ticket2Id != 0) {
  //          System.out.println(ticket2Id + " | " + ticket2PersonData + " | " + ticket2MovieTitle + " - " + movieType + " - " + movieTime + "min");
        }

  //      System.out.println("Liczba pozostałych miejsc: " + freeSeats);
  //      System.out.println("Liczba sprzedanych biletów: " + (move1.maxSeats - freeSeats));
  //  }

    void ticetInfo() {
        System.out.println();
    }
}

