package com.company;

import java.util.Date;

public class Revista {

    //ATRIBUTOS
    private int id;
    private String titulo;
    private Date fechaEdicion;
    private String editorial;
    private String genero;

    public Revista(String titulo, Date fechaEdicion, String editorial) {
        this.titulo = titulo;
        this.fechaEdicion = fechaEdicion;
        this.editorial = editorial;
    }
}
