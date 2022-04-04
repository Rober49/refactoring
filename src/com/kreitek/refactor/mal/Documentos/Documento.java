package com.kreitek.refactor.mal.Documentos;

import java.util.Date;

public abstract class Documento {
    private String numDocumento;
    private Date fechaValidez;

    public String getNumDocumento(){
        return this.numDocumento;
    }

    public Date getFechaValidez(){
        return this.fechaValidez;
    }
}
