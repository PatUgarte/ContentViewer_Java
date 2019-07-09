package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Pelicula extends Film
        implements Visualizable {

    //ATRIBUTOS
    private long tiempoVisto;

    //CONSTRUCTORES
    public Pelicula(String titulo, String genero, String creador, int duracion, short anio) {
        super(titulo, genero, creador, duracion);
        setAnio(anio);
    }

    //METODOS
    public long getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(long tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    @Override
    public String toString() {
        return " ::: PELÍCULA :::\n" + super.toString() + "\n";
    }

    @Override
    public Date inicioVisualizacion() {
        return new Date();
    }

    @Override
    public void finVisualizacion(Date inicio) {
        Date fin = new Date();

        if(fin.getTime() > inicio.getTime()){
            long segundosVistos = fin.getTime() - inicio.getTime();
            setTiempoVisto(getTiempoVisto()+segundosVistos);
        } else {
            setTiempoVisto(getTiempoVisto()+0);
        }
    }

    public static ArrayList<Pelicula> dameListaPeliculas(){
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            peliculas.add(new Pelicula("Peli"+i,"Genero"+i,"Creador"+i,120+i*10,(short) (2014+i)));
        }

        return peliculas;
    }
}
