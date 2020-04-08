package org.example.accessSpecifiers.task3;

public class Charger {
    void chargerLevelVolume(Telophone telophone){
        telophone.setChargeLevel((telophone.getChargeLevel()+1));
    }
}
