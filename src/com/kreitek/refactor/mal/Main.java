package com.kreitek.refactor.mal;

import com.kreitek.refactor.mal.Documentos.CIF;
import com.kreitek.refactor.mal.Documentos.DNI;
import com.kreitek.refactor.mal.Documentos.NIE;

class Main
{
    public static void main(String args[]) throws Exception {
        System.out.println("=====================");
        System.out.println("Vamos a refactorizar!");
        System.out.println("=====================");

        //Creamos la factoría principal
        ValidadorFactoryCreator mainFactory = new ValidadorFactoryCreator();

        //Validador de DNI
        ValidadorFactory factory = mainFactory.getFactory("DNI");
        ValidadorDocumento validador = factory.getValidador();

        // creamos un DNI correcto
        DNI dniCorrecto = new DNI("11111111H", null);
        Boolean esValido = (validador.validar(dniCorrecto));
        System.out.println( "DNI " + dniCorrecto.getNumDocumento() + " es: " + esValido.toString());

        // creamos un DNI incorrecto
        DNI dniIncorrecto01 = new DNI("24324356A", null);
        Boolean esValido01 = (validador.validar(dniIncorrecto01));
        System.out.println( "DNI " + dniIncorrecto01.getNumDocumento() + " es: " + esValido01.toString());

        //Validador de NIE
        factory = mainFactory.getFactory("NIE");
        validador = factory.getValidador();

        // creamos un NIE correcto
        NIE nieCorrecto = new NIE("X0932707B", null);
        Boolean esValidoNie = (validador.validar(nieCorrecto));
        System.out.println( "NIE " + nieCorrecto.getNumDocumento() + " es: " + esValidoNie.toString());

        // creamos un NIE incorrecto
        NIE nieIncorrecto = new NIE("Z2691139Z", null);
        Boolean esValidoNieIncorrecto = (validador.validar(nieIncorrecto));
        System.out.println( "NIE " + nieIncorrecto.getNumDocumento() + " es: " + esValidoNieIncorrecto.toString());

        //Validador de CIF
        factory = mainFactory.getFactory("CIF");
        validador = factory.getValidador();

        // creamos un CIF correcto
        CIF cifCorrecto = new CIF("W9696294I", null);
        Boolean esValidoCIF = (validador.validar(cifCorrecto));
        System.out.println( "CIF " + cifCorrecto.getNumDocumento() + " es: " + esValidoCIF.toString());

        // creamos un CIF incorrecto
        CIF cifIncorrecto = new CIF("W9696294A", null);
        Boolean esValidoCifIncorrecto = (validador.validar(cifIncorrecto));
        System.out.println( "NIE " + cifIncorrecto.getNumDocumento() + " es: " + esValidoCifIncorrecto.toString());
    }
}