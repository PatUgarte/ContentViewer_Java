package com.company;

public class Pelicula {

    //ATRIBUTOS
    private int id;
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private short anio;
    private boolean vista;
    private int tiempoVisto;

    public Pelicula(String titulo, String genero, short anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    public Pelicula(String titulo, String genero, String creador, int duracion, short anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.anio = anio;
    }

    public void mostrarInformacion(){
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + anio);

    }
}
