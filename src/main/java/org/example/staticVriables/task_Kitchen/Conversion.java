package org.example.staticVriables.task_Kitchen;

public class Conversion {
    static double CUP_MIL = 250;
    static double SPOON_MILL = 15;
    static double TEA_SPOON_MILL = 5;


    static double cupToMIL(double glasses) {
        return glasses * CUP_MIL;
    }
    static double spoonToMIL(double spoons){
        return spoons* SPOON_MILL;
    }
    static double teaSpoonToMilL(double tea_spoon){
        return tea_spoon*TEA_SPOON_MILL;
    }

}
