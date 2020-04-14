package org.example.typEnum.pizzeria;

enum Pizza {
    MARGHERITTA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTOO(true, true, false, true);;

    private final boolean tomatoSoup;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSoup, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSoup = tomatoSoup;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String result = name();
        if (tomatoSoup) {
            result += " Sos Pomidorowy ";
        }
        if (cheese) {
            result += " Ser ";
        }
        if (mushrooms) {
            result += " Pieczarki ";
        }
        if (ham) {
            result += " Szynka ";
        }
        return result;
    }
}
