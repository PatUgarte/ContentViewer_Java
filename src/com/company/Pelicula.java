package com.company;

public class Pelicula extends Film {

    //ATRIBUTOS
    private int tiempoVisto;

    //CONSTRUCTORES
    public Pelicula(String titulo, String genero, String creador, int duracion, short anio) {
        super(titulo, genero, creador, duracion);
        setAnio(anio);
    }

    //METODOS
    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }
}
