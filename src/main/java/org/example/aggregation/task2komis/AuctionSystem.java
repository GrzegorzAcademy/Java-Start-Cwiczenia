package org.example.aggregation.task2komis;

public class AuctionSystem {
    public static void main(String[] args) {

        Auction auction1 = new Auction();
        User user = new User();
        auction1.seller = new User();
        auction1.seller.setFirstName("Jan");
        auction1.seller.setLsatName("Kowalski");
        auction1.seller.adress = new Adress();
        auction1.seller.adress.setCity("Wrocław");
        auction1.seller.adress.setStreet("Kościuszki");
        auction1.seller.adress.setHomeNumber("24A");
        auction1.seller.adress.setFlatNr(21);
        auction1.setTitle("X-Box One");
        auction1.setDistcription("Konsola dla wymagających");
        auction1.setPrice(999.99);

        Auction auction2 = new Auction();
        User user2 = new User();
        auction2.seller = user2;
        auction2.setTitle("Samsung S 20");
        auction2.setDistcription("Niesamowity telefon z trzema obiektywami");
        auction2.setPrice(3900);
        auction2.seller.setFirstName("Justyna ");
        auction2.seller.setLsatName("Adamczyk");

        System.out.println("Dostępne aukcje");
        System.out.println(auction1.getTitle() + " , " + auction1.getDistcription() + " , " +
                auction1.getPrice() + "zł, sprzedający " + auction1.seller.getFirstName() + " , " +
                auction1.seller.getLsatName());
        System.out.println(auction2.getTitle() + " , " + auction2.getDistcription() + " , " +
                auction2.getPrice() + "zł, sprzedający " + auction2.seller.getFirstName() + " , " +
                auction2.seller.getLsatName());


    }
}
