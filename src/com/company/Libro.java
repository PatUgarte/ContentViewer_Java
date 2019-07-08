package com.company;

import java.util.Date;

public class Libro extends Publicacion{

    //ATRIBUTOS
    private String[] autores;

    //CONSTUCTORES
    public Libro(String titulo, Date fechaEdicion, String editorial, String[] autores) {
        super(titulo, fechaEdicion, editorial);
        this.autores = autores;
    }

    //METODOS
    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }
}
