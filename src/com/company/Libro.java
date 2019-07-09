package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Libro extends Publicacion
        implements Visualizable{

    //ATRIBUTOS
    private String[] autores;
    private long tiempoLeido;

    //CONSTUCTORES
    public Libro(String titulo, Date fechaEdicion, String editorial) {
        super(titulo, fechaEdicion, editorial);
    }

    //METODOS
    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public long getTiempoLeido() {
        return tiempoLeido;
    }

    public void setTiempoLeido(long tiempoLeido) {
        this.tiempoLeido = tiempoLeido;
    }

    @Override
    public String toString() {
        return " ::: LIBRO ::: \n" + super.toString() + "\nAUTOR/ES: " + autores + "\n";
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
            setTiempoLeido(getTiempoLeido()+segundosVistos);
        } else {
            setTiempoLeido(getTiempoLeido()+0);
        }
    }

    public static ArrayList<Libro> dameListaLibros(){
        ArrayList<Libro> libros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            libros.add(new Libro("Libro"+i,new Date(),"Editorial"+i));
        }

        return libros;
    }
}
