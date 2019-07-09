package com.company;

import com.patugarte.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pelicula> peliculas;

    public static void main(String[] args) {
        // write your code here

        mostrarMenu();

        int enteros[] = new int[];

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

            //Leer la respuesta del usuario
            System.out.print("\n> Ingrese la opción deseada: ");
            Scanner scanner = new Scanner(System.in);
            eleccion = Integer.valueOf(scanner.nextLine());

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
                    hacerReporte(new Date());
                    break;
                default:
                    System.out.println("\nPor favor seleccione una opción válida.\n");
                    break;


            }

        } while (eleccion != 0);
    }

    public static void mostrarPeliculas() {
        peliculas = Pelicula.dameListaPeliculas();
        int exit = 0;
        do {
            System.out.println("\n :: PELÍCULAS :: \n");
            int numero = 1;
            for (Pelicula pelicula : peliculas) {
                System.out.println( numero + ". " + pelicula.getTitulo() + " Vista: " + pelicula.getVista() );
                numero++;
            }
            System.out.print("\n> Ingrese 0 para regresar al Menú anterior: \n");
            Scanner scanner = new Scanner(System.in);
            exit = Integer.valueOf(scanner.nextLine());

            if(exit > 0 && exit <= peliculas.size()){
                Pelicula peliculaElegida = peliculas.get(exit-1);
                peliculaElegida.setVista(true);
                Date momentoDeInicio = peliculaElegida.inicioVisualizacion();
                for (int i = 0; i < 999 ; i++) {
                    System.out.println("..............");
                }
                peliculaElegida.finVisualizacion(momentoDeInicio);

                System.out.println("Viste " + peliculaElegida.getTiempoVisto() + "[ms] de:\n" + peliculaElegida);
            } else if(exit > peliculas.size()){
                System.out.println("¡ERROR DE INGRESO!");
            }

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
        ArrayList<Libro> libros = Libro.dameListaLibros();
        int exit = 0;
        do {
            System.out.println("\n :: LIBROS :: \n");
            int numero = 1;
            for (Libro libro : libros) {
                System.out.println( numero + ". " + libro.getTitulo() + " Leido: " + libro.getLeido() );
                numero++;
            }
            System.out.print("\n> Ingrese 0 para regresar al Menú anterior: \n");
            Scanner scanner = new Scanner(System.in);
            exit = Integer.valueOf(scanner.nextLine());

            if(exit > 0 && exit <= libros.size()){
                Libro libroElegido = libros.get(exit-1);
                libroElegido.setLeido(true);
                Date momentoDeInicio = libroElegido.inicioVisualizacion();
                for (int i = 0; i < 999 ; i++) {
                    System.out.println("..............");
                }
                libroElegido.finVisualizacion(momentoDeInicio);

                System.out.println("Leiste " + libroElegido.getTiempoLeido() + "[ms] el:\n" + libroElegido);
            } else if(exit > libros.size()){
                System.out.println("¡ERROR DE INGRESO!");
            }

        }while(exit != 0);
    }

    public static void mostrarRevistar() {
        int exit = 0;
        do {
            System.out.println("\n :: REVISTAS :: \n");
        }while(exit != 0);
    }

    public static void hacerReporte(){
        Report report = new Report();

        report.setTitulo(" :: REPORTE :: ");
        report.setNombreArchivo("informe_de_visualizacion");
        report.setExtension("txt");
        String contenido = "";
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getVista()){
                contenido += pelicula.toString();
            }
        }
        report.setContenido(contenido);
        report.hacerReporte();
    }

    public static void hacerReporte(Date fechaDelDia){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String fechaConFormato = simpleDateFormat.format(fechaDelDia);

        Report report = new Report();
        report.setTitulo(" :: REPORTE :: ");
        report.setNombreArchivo("informe_con_fecha");
        report.setExtension("txt");
        String contenido = "Informe confeccionado el " + fechaConFormato + "\n";
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getVista()){
                contenido += pelicula.toString();
            }
        }
        report.setContenido(contenido);
        report.hacerReporte();
    }

}