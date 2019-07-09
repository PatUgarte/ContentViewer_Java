package com.company;

public class Capitulo extends Pelicula {

    //ATRIBUTOS
    byte numeroTemporada;

    //CONSTRUCTORES
    public Capitulo(String titulo, String genero, String creador, int duracion, short anio, byte numeroTemporada) {
        super(titulo, genero, creador, duracion, anio);
        this.numeroTemporada = numeroTemporada;
    }

    //METODOS
    public byte getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(byte numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    @Override
    public String toString() {
        return " ::: CAPÍTULO :::\n" + super.toString() + "TEMPORADA: " + numeroTemporada + "\n";
    }
}
