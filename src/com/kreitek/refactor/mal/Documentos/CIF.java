package com.kreitek.refactor.mal.Documentos;

import java.util.Date;

public class CIF extends Documento{
    private String numDocumento;
    private Date fechaValidez;

    public CIF(String numDocumento, Date fechaValidez){
        this.numDocumento = numDocumento;
        this.fechaValidez = fechaValidez;
    }

    @Override
    public String getNumDocumento(){
        return this.numDocumento;
    }
    @Override
    public Date getFechaValidez(){
        return this.fechaValidez;
    }
}
