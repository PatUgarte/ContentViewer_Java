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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
