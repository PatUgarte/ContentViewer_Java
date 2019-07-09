package com.company;

public class Film {
    //ATRIBUTOS
    private int id;
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private short anio;
    private boolean vista;

    //CONSTRUCTORES
    public Film(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    //METODOS


    public int getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public boolean getVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    @Override
    public String toString() {
        return "\tID: " + id +
                "\n\tGÉNERO: " + genero +
                "\n\tTÍTULO: " + titulo +
                "\n\tCREADOR: " + creador +
                "\n\tDURACIÓN: " + duracion +
                "\n\tAÑO: " + anio +
                "\n\t¿VISTA?: " + vista;
    }
}
