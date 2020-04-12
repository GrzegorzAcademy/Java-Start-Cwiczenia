package org.example.staticVriables.car;

public class Car {
    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARBIBG_DOOR_OPEN = 500;

    private int fuel;
    private boolean engineOK;
    private boolean engineOn;
    private boolean fuleFlapOn;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOK, boolean engineOn, boolean fuleFlapOn, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOK = engineOK;
        this.fuleFlapOn = fuleFlapOn;
        this.doorsOpen = doorsOpen;
        setEngineON(engineOn);
    }

    public boolean isEngineOK() {
        return engineOK;
    }

    public void setEngineON(boolean engineOn) {
        int systemCheck = systemcheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL)
            this.engineOn = false;
        else
            this.engineOn = engineOn;
    }

    public void setEngineOK(boolean engineOK) {
        if (!engineOK)
            engineOn = false;
        this.engineOn = engineOK;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0)
            engineOn = false;
        this.fuel = fuel;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public boolean isFuleFlapOn() {
        return fuleFlapOn;
    }

    public void setFuleFlapOn(boolean fuleFlapOn) {
        this.fuleFlapOn = fuleFlapOn;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    private int systemcheck() {
        if (!engineOK)
            return ERROR_CHECK_ENGINE;
        if (fuel == 0)
            return ERROR_NO_FUEL;
        if (fuleFlapOn)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsOpen)
            return WARBIBG_DOOR_OPEN;
        return OK;
    }

    String status() {
        String status = "";
        if (systemcheck() == OK)
            return "Wszystkie systemy sprawne start silnika ";
        if (!engineOK)
            status += "Awaria Silnika ";
        if (fuel == 0)
            status += " Brak paliwa ";
        if (isFuleFlapOn())
            System.out.println(" Otwarta pokrywa wlewu paliwa ");
        if (doorsOpen)
            status += " drzwi otwarte ";
        if (engineOn)
            status += " silnik włączony  ";
        else
            status += " silnik wyłąćzony ";
        return status;
    }
}

