package org.example.staticVriables.task_Kitchen;

public class Recipe {
    public static void main(String[] args) {


        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double glassesMIll = Conversion.cupToMIL(waterGlasses);
        double spoonsMil = Conversion.spoonToMIL(oilSpoons);
        double teaSpoomsMill = Conversion.teaSpoonToMilL(honeyTeaspoons);
        System.out.println("Twój przepis");
        System.out.println(" potrzebujesz " + waterGlasses + " szt " + " to " + glassesMIll + " mililitrów " + " wody");
        System.out.println(" potrzebujesz " + oilSpoons + " szt " + " to " + spoonsMil + " mililitrów " + " oleju ");
        System.out.println(" potrzebujesz " + honeyTeaspoons + " szt " + " to " + teaSpoomsMill + " mililitrów " + " miodu ");

    }
}
