package com.kreitek.refactor.mal.Utils;

public class CheckNumeric {
    //Método estático para comprobar si una cadena es sólo de números
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
