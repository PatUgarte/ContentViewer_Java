package com.company;

import java.util.Date;

public class Publicacion {

    //ATRIBUTOS
    private int id;
    private String titulo;
    private Date fechaEdicion;
    private String editorial;
    private Boolean leido;

    //CONSTRUCTORES
    public Publicacion(String titulo, Date fechaEdicion, String editorial) {
        this.titulo = titulo;
        this.fechaEdicion = fechaEdicion;
        this.editorial = editorial;
        this.leido = false;
    }

    //METODOS
    public int getId() {
        return id;
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

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "\tID: " + id +
                "\n\tTÍTULO: " + titulo +
                "\n\tFECHA DE EDICIÓN: " + fechaEdicion +
                "\n\tEDITORIAL: " + editorial;
    }
}
