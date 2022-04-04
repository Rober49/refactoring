package com.kreitek.refactor.mal.Validadores;

import com.kreitek.refactor.mal.ValidadorDocumento;
import com.kreitek.refactor.mal.ValidadorFactory;

public class ValidarNIEFactory implements ValidadorFactory {
    @Override
    public ValidadorDocumento getValidador() {
        return new ValidadorNIE();
    }
}
