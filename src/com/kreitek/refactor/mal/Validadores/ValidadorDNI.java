package com.kreitek.refactor.mal.Validadores;

import com.kreitek.refactor.mal.Documentos.DNI;
import com.kreitek.refactor.mal.Documentos.Documento;
import com.kreitek.refactor.mal.Utils.CheckNumeric;
import com.kreitek.refactor.mal.ValidadorDocumento;

public class ValidadorDNI implements ValidadorDocumento {
    @Override
    public boolean validar(Documento doc) {
        DNI dni = null;
        try {
            dni = (DNI) doc;
        } catch (IllegalStateException ex){
            System.err.println("El documento introducido no es un DNI");
            return false;
        }
        // posibles letras en un DNI
        String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";
        // los primeros 8 caracteres son números
        String intPartDNI = dni.getNumDocumento().trim().replaceAll(" ","").substring(0,8);
        // el último es un dígito de control
        char ltrDNI = dni.getNumDocumento().charAt(8);
        // calculamos el módulo de 23 de la parte numérica que debería ser el caracter en esa
        // posición en la lista de dniChar --> my code Rocks!!!
        int valNumDni = Integer.parseInt(intPartDNI) % 23;

        // comprobamos que tutto esté bien
        if (dni.getNumDocumento().length()!= 9 || CheckNumeric.isNumeric(intPartDNI) == false || dniChars.charAt(valNumDni)!= ltrDNI) {
            return false; // algo no se cumple
        } else {
            return true; // to correcto
        }
    }
}
