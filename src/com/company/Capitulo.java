package com.company;

public class Capitulo {

    //ATRIBUTOS
    int id;
    String titulo;
    String creador;
    int duracion;
    short anio;
    boolean vista;
    int tiempoVisto;
    byte numeroTemporada;

    public Capitulo(String titulo, int duracion, short anio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public byte getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(byte numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
}
