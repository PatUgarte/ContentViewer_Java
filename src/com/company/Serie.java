package com.company;

public class Serie {

    //ATRIBUTOS
    private int id;
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private short anio;
    private boolean vista;
    private int tiempoVisto;
    private byte cantidadTemporadas;
    private short cantidadCapitulos;
    private Capitulo[] listaCapitulos;

    public void suma(int... numeros){
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        System.out.println(sumatoria);
    }

    public Serie(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
}
