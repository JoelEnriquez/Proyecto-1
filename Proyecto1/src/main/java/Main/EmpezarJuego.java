package Main;

import Tablero.ControladorMapas;
import Diseños.DiseñoMapa;
import Tablero.Jugar;
import java.util.Scanner;

public class EmpezarJuego {

    boolean jugar = true;
    private String elegir;
    private Scanner miScanner = new Scanner(System.in);
    private Jugar nuevoJuego = new Jugar();
    private ControladorMapas existenciaMapas;

    private String jugador1 = "";
    private String jugador2 = "";
    private int filas = 0;
    private int columnas = 0;
    private int planetasNeutrales = 0;
    private int neutralesParaEditar = 0;

    public void iniciar() {
        existenciaMapas = new ControladorMapas();

        while (jugar) {
            System.out.println("Escoge una opcion");
            System.out.println("1. Jugar\n"
                    + "2. Crear o editar mapa\n"
                    + "3. Salir del Juego");

            elegir = miScanner.next();
            //Jugar con un mapa ya creado
            if (elegir.equalsIgnoreCase("1")) {
                int cont = existenciaMapas.getMapas().length;
                if (cont == 0) {
                    System.out.println("No existen mapas. Diseñe un mapa primero\n");
                    iniciar();
                } else {
                    System.out.println("Escoja un mapa");
                    //Escoge un mapa
                }

                //Editar o Crear un Mapa
            } else if (elegir.equalsIgnoreCase("2")) {
                boolean repetir = true;
                while (repetir) {
                    System.out.println("\nEscoge una opcion");
                    System.out.println("1. Crear Mapa\n"
                            + "2. Editar Mapa\n"
                            + "3. Regresar al Menu Principal");
                    Scanner eleccion = new Scanner(System.in);
                    String decision = eleccion.next();

                    //Creacion de un mapa
                    if (decision.equalsIgnoreCase("1")) {
                        Scanner lectura = new Scanner(System.in);
                        System.out.println("\nBienvenido a la creacion de Mapas");

                        //Ingresar nombre de los jugadores
                        do {
                            System.out.println("Ingrese el nombre del Jugador 1");
                            jugador1 = lectura.next();                          
                        } while (jugador1.equals(""));
                        
                        do {
                            System.out.println("\nIngrese el nombre del Jugador 2");
                            jugador2 = lectura.next();
                        } while (jugador2.equals(""));
                        
                        boolean seguir = false;
                        //Escoger un numero de filas
                        while (!seguir) {
                            System.out.println("\nEscoja un numero de filas");
                            filas = lectura.nextInt();
                            if (filas > 0) {
                                seguir = true;
                            } else {
                                System.out.println("Porfavor, elija un numero de filas mayor a 0.\n");
                            }
                        }
                        seguir = false;

                        //Escoger un numero de columnas
                        while (!seguir) {
                            System.out.println("\nElija el numero de columnas");
                            columnas = lectura.nextInt();
                            if (columnas > 0) {
                                seguir = true;
                            } else {
                                System.out.println("Porfavor, elija un numero de columnas mayor a 0.\n");
                            }
                        }
                        seguir = false;

                        //Ingresar numero de Planetas Neutrales
                        int espaciosDisponibles = (filas * columnas) - 2;
                        while (!seguir) {
                            System.out.println("\n¿Cuantos planetas neutrales desea generar?");
                            System.out.println("Rango valido: (1-" + espaciosDisponibles + ")");
                            planetasNeutrales = lectura.nextInt();
                            if (planetasNeutrales > 0 && planetasNeutrales <= espaciosDisponibles) {
                                seguir = true;
                            } else {
                                System.out.println("Porfavor, elija un numero correcto de planetas neutrales.");
                            }
                        }
                        seguir = false;

                        //Eleccion para ver cuantos planetas son creados aleatoriamente y cuales manualmente
                        while (!seguir) {
                            System.out.println("\n¿Cuantos planetas neutrales desea editar manualmente?");
                            System.out.println("Rango valido: (0-" + planetasNeutrales + ")");
                            neutralesParaEditar = lectura.nextInt();
                            if (neutralesParaEditar >= 0 && neutralesParaEditar <= planetasNeutrales) {
                                seguir = true;
                            } else {
                                System.out.println("Porfavor, elija un numero correcto de planetas neutrales para editar.");
                            }
                        }
                        
                        System.out.println("");
                        DiseñoMapa diseñoMapa = new DiseñoMapa(filas, columnas, planetasNeutrales, neutralesParaEditar,jugador1, jugador2);
                        diseñoMapa.crearPlanetas();
                        /*diseñoMapa.setNombreJugador1(jugador1);
                        diseñoMapa.setNombreJugador2(jugador2);
                        diseñoMapa.setFilas(filas);
                        diseñoMapa.setColumnas(columnas);
                        diseñoMapa.setPlanetasNeutrales(planetasNeutrales);
                        diseñoMapa.setNeutralesParaEditar(neutralesParaEditar);
                        
                        //System.out.println(diseñoMapa);
                        /*diseñoMapa.setFilas(filas);
                        diseñoMapa.setColumnas(columnas);
                        diseñoMapa.setPlanetasNeutrales(planetasNeutrales);
                        diseñoMapa.setNeutralesEditados(neutralesEditados);
                         */

                        //Editar un mapa ya existente
                    } else if (decision.equalsIgnoreCase("2")) {

                    } else if (decision.equalsIgnoreCase("3")) {
                        System.out.println("");
                        repetir = false;
                    } else {
                        System.out.println("Elija una opcion valida, porfavor.");
                    }
                }
                iniciar();

                //Terminar el programa
            } else if (elegir.equalsIgnoreCase("3")) {
                jugar = false;
            } else {
                System.out.println("Opcion incorrecta. Escoja una opcion correcta\n");
            }
        }
    }
}

//Si no estoy cuando vengas, regreso en 5 minutos hahaha xd 
