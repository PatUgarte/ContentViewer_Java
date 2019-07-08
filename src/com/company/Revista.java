package com.company;

import java.util.Date;

public class Revista extends Publicacion {

    //ATRIBUTOS
    private String tematica;

    //CONSTRUCTORES
    public Revista(String titulo, Date fechaEdicion, String editorial, String tematica) {
        super(titulo, fechaEdicion, editorial);
        this.tematica = tematica;
    }

    //METODOS
    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
