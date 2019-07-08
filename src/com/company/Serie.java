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

    public byte getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(byte cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public short getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public void setCantidadCapitulos(short cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public Capitulo[] getListaCapitulos() {
        return listaCapitulos;
    }

    public void setListaCapitulos(Capitulo[] listaCapitulos) {
        this.listaCapitulos = listaCapitulos;
    }
}
