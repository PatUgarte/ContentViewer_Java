package com.company;

import java.util.List;

public class Serie extends Film {

    //ATRIBUTOS
    private int tiempoVisto;
    private byte cantidadTemporadas;
//    private short cantidadCapitulos;
    private List<Capitulo> listaCapitulos;

    //CONSTRUCTORES
    public Serie(String titulo, String genero, String creador, int duracion, byte cantidadTemporadas) {
        super(titulo, genero, creador, duracion);
        this.cantidadTemporadas = cantidadTemporadas;
    }

    //METODOS
    public void suma(int... numeros){
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        System.out.println(sumatoria);
    }

    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public byte getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(byte cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public List<Capitulo> getListaCapitulos() {
        return listaCapitulos;
    }

    public void setListaCapitulos(List<Capitulo> listaCapitulos) {
        this.listaCapitulos = listaCapitulos;
    }

    @Override
    public String toString() {
        return " ::: SERIE :::\n" + super.toString();
    }
}
