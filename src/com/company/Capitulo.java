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
}
