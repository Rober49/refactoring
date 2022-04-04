package com.kreitek.refactor.mal;

import com.kreitek.refactor.mal.Validadores.ValidarCIFFactory;
import com.kreitek.refactor.mal.Validadores.ValidarDNIFactory;
import com.kreitek.refactor.mal.Validadores.ValidarNIEFactory;

public class ValidadorFactoryCreator {
    public ValidadorFactory getFactory(String documento) throws Exception {
        switch (documento){
            case "DNI":
                return new ValidarDNIFactory();
            case "CIF":
                return new ValidarCIFFactory();
            case "NIE":
                return new ValidarNIEFactory();
            default:
                throw new Exception();
        }
    }
}
