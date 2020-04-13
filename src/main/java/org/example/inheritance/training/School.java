package org.example.inheritance.training;

public class School {
    public static void main(String[] args) {
        StationaryTraining stationaryTraining = new StationaryTraining("JAVA-STACJO-GDA-234","Hibernaite",2300," Gdańsk ",30);
        stationaryTraining.setDescription(" Szkolenie podstawowe dla początkujących programistóœ ");
       BootCamp bootCamp = new BootCamp("JAVA-BOOTC-WRO-234","Spring",1500,"Tomasz","Martyniuk",20);
        System.out.println(bootCamp.toString());
        System.out.println(stationaryTraining.toString());
        TraningOnline traningOnline = new TraningOnline("JAVA-ONLINE-236","SQL",200,100,200);
        System.out.println(traningOnline.toString());
    }
}
