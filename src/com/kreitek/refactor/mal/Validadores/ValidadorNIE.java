package com.kreitek.refactor.mal.Validadores;

import com.kreitek.refactor.mal.Documentos.Documento;
import com.kreitek.refactor.mal.Documentos.NIE;
import com.kreitek.refactor.mal.ValidadorDocumento;

public class ValidadorNIE implements ValidadorDocumento {
    @Override
    public boolean validar(Documento doc) {
        NIE nie = null;
        try {
            nie = (NIE) doc;
        } catch (IllegalStateException ex){
            System.err.println("El documento introducido no es un NIE");
            return false;
        }
        boolean esValido = false;
        int i = 1;
        int caracterASCII = 0;
        char letra = ' ';
        int miNIE = 0;
        int resto = 0;
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        String nieStr = nie.getNumDocumento();

        if(nieStr.length() == 9 && Character.isLetter(nieStr.charAt(8))
                && nieStr.substring(0,1).toUpperCase().equals("X")
                || nieStr.substring(0,1).toUpperCase().equals("Y")
                || nieStr.substring(0,1).toUpperCase().equals("Z")) {

            do {
                caracterASCII = nieStr.codePointAt(i);
                esValido = (caracterASCII > 47 && caracterASCII < 58);
                i++;
            } while(i < nieStr.length() - 1 && esValido);
        }

        if(esValido && nieStr.substring(0,1).toUpperCase().equals("X")) {
            nieStr = "0" + nieStr.substring(1,9);
        } else if(esValido && nieStr.substring(0,1).toUpperCase().equals("Y")) {
            nieStr = "1" + nieStr.substring(1,9);
        } else if(esValido && nieStr.substring(0,1).toUpperCase().equals("Z")) {
            nieStr = "2" + nieStr.substring(1,9);
        }

        if(esValido) {
            letra = Character.toUpperCase(nieStr.charAt(8));
            miNIE = Integer.parseInt(nieStr.substring(1,8));
            resto = miNIE % 23;
            esValido = (letra == asignacionLetra[resto]);
        }

        if (esValido) {
            return true; // todo OK
        } else {
            return false; // algo NOK
        }
    }
}
