package org.example.aggregation.task1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Nowak",
                "854475321", 23);

        Adress adress1 = new Adress();
        person1.adressRegisted = adress1;
        adress1.setZipCode("12-120");
        adress1.setNubrerOfHause("10");
        adress1.setStreet("Kowaliowa");
        adress1.setCity("Warszawa");
        BankAcount bankAcount1 = new BankAcount();
        Credit credit1 = new Credit();

        bankAcount1.customer = person1;
        bankAcount1.numberAcount = 12362658;
        bankAcount1.ballance = 10_1000;

        credit1.debtor = person1;
        credit1.setCaschCredit(2000);
        credit1.setInterest(0.2);
        credit1.setPeroid(20);
        credit1.setTime(15);


        Person person2 = new Person("Roman", "Polański",
                "2589985", 45);
        Adress adress2 = new Adress();
        person2.adressRegisted = adress1;
        person2.adressLiving = adress2;
        person2.adressLiving.setCity("Kraków");
        person2.adressLiving.setStreet("Włukiennicza");
        person2.adressLiving.setZipCode("12-369");
        person2.adressLiving = adress2;

        BankAcount bankAcount2 = new BankAcount();
        Credit credit2 = new Credit();

        bankAcount2.customer = person1;
        bankAcount2.setNumberAcount(985632589);
        bankAcount2.setBallance(20_10000);

        credit2.debtor = person1;
        credit2.setCaschCredit(2000000);
        credit2.setInterest(0.20);
        credit2.setPeroid(1210);
        credit2.setTime(1000);

        System.out.println(" Osoba pierwsza");
        System.out.println(person1.getFirstName() + "  " + person1.getLastName());
        System.out.println("Zamieszkała w : " + person1.adressRegisted);
        System.out.println("Ma na koncie " + bankAcount1.ballance + " zł");

        System.out.println("Osoba druga : ");
        System.out.println(person2.getFirstName() + "  " + person2.getLastName());
        System.out.println("Zamieszkały w : " + person2.adressRegisted);
        System.out.println("Ma na koncie " + bankAcount2.ballance + " zł");
    }

}