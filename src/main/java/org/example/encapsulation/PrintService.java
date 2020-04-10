package org.example.encapsulation;

public class PrintService {
public void printSumary(Person person ,double orginalPrice, double fixPrice){
    welcomeMasage(person);
    calculatePrice(orginalPrice,fixPrice);
}

    void welcomeMasage(Person person){
        String firstname = person.getFirstName();
        String lastname = person.getLastName();
        if (firstname==null && lastname !=null)
            System.out.println("Witaj " + lastname);
        else if (firstname!= null && lastname == null)
            System.out.println("Witaj " + firstname);
        else if (firstname!= null&& lastname!= null)
            System.out.println("Witaj " + firstname+ " "+ lastname);
        else System.out.println("Witaj");
        }
        void calculatePrice(double orginalPrice, double fixPrice){
            System.out.println("Cena orginalna " + orginalPrice);
            System.out.println("Do zapłaty po rabacie " + fixPrice);
        }
}
