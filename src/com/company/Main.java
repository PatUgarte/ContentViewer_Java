package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pelicula pelicula = new Pelicula("Coco", "Animación", (short) 2017);
        pelicula.mostrarInformacion();
        mostrarMenu();
    }



    public static void mostrarMenu() {
        int eleccion = 0;

        do {

            System.out.println("¡BIENVENIDAS/OS AL SUPER-AMAZING CONTENT VIEWER!\n");
            System.out.println("Selecciona el número de la opción deseada: ");
            System.out.println("\t1 > Películas");
            System.out.println("\t2 > Series");
            System.out.println("\t3 > Libros");
            System.out.println("\t4 > Revistas");
            System.out.println("\t5 > Reporte");
            System.out.println("\t6 > Reporte DE HOY");
            System.out.println("\t0 > Salir");

            switch (eleccion) {
                case 0:
                    System.out.println("\n¡CHAU!\n");
                    //TODO: Salir
                    return;
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    mostrarSeries();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    mostrarRevistar();
                    break;
                case 5:
                    hacerReporte();
                    break;
                case 6:
                    hacerReporte(new Date(eleccion));
                    break;
                default:
                    System.out.println("\nPor favor seleccione una opción válida.\n");
                    break;


            }

        } while (eleccion != 0);
    }

    public static void mostrarPeliculas() {
        int exit = 0;
        do {
            System.out.println("\n :: PELÍCULAS :: \n");
        }while(exit != 0);
    }

    public static void mostrarSeries() {
        int exit = 0;
        do {
            System.out.println("\n :: SERIES :: \n");
        }while(exit != 0);
    }

    public static void mostrarCapitulos() {
        int exit = 0;
        do {
            System.out.println("\n :: CAPÍTULOS :: \n");
        }while(exit != 0);
    }

    public static void mostrarLibros() {
        int exit = 0;
        do {
            System.out.println("\n :: LIBROS :: \n");
        }while(exit != 0);
    }

    public static void mostrarRevistar() {
        int exit = 0;
        do {
            System.out.println("\n :: REVISTAS :: \n");
        }while(exit != 0);
    }

    public static void hacerReporte(){

    }

    public static void hacerReporte(Date fechaDelDia){

    }

}
