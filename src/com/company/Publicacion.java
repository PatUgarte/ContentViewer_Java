package com.company;

import java.util.Date;

public class Publicacion {

    //ATRIBUTOS
    private int id;
    private String titulo;
    private Date fechaEdicion;
    private String editorial;

    //CONSTRUCTORES
    public Publicacion(String titulo, Date fechaEdicion, String editorial) {
        this.titulo = titulo;
        this.fechaEdicion = fechaEdicion;
        this.editorial = editorial;
    }

    //METODOS
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
}
