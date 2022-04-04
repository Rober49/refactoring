package com.kreitek.refactor.mal.Validadores;

import com.kreitek.refactor.mal.ValidadorDocumento;
import com.kreitek.refactor.mal.ValidadorFactory;

public class ValidarCIFFactory implements ValidadorFactory {
    @Override
    public ValidadorDocumento getValidador() {
        return new ValidadorCIF();
    }
}
