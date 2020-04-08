package Diseños;

import Planetas.Planeta;

public class DiseñoMapa {

    private int filas;
    private int columnas;
    private int planetasNeutrales;
    private int neutralesParaEditar;
    private final int NUMERO_JUGADORES = 2;
    private int numeroPlanetasTotales;
    private String nombreJugador1;
    private String nombreJugador2;

    public DiseñoMapa(int filas, int columnas, int planetasNeutrales, int neutralesParaEditar, String nombreJugador1, String nombreJugador2) {
        this.filas = filas;
        this.columnas = columnas;
        this.planetasNeutrales = planetasNeutrales;
        this.neutralesParaEditar = neutralesParaEditar;
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void crearPlanetas() {
        ejecutarNuevoPlaneta();
    }

    public Planeta[] ejecutarNuevoPlaneta() {
        Planeta[] planetasNuevos = new Planeta[numeroPlanetasTotales];
        
        DiseñoPlanetas nuevoPlaneta = new DiseñoPlanetas(nombreJugador1, nombreJugador2, planetasNeutrales, neutralesParaEditar, numeroPlanetasTotales());  
        nuevoPlaneta.asignarTamaño();
        nuevoPlaneta.editarBases();

        return planetasNuevos;
    }

    public void setNeutralesParaEditar(int neutralesParaEditar) {
        this.neutralesParaEditar = neutralesParaEditar;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setPlanetasNeutrales(int planetasNeutrales) {
        this.planetasNeutrales = planetasNeutrales;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    public int getNeutralesParaEditar() {
        return neutralesParaEditar;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getPlanetasNeutrales() {
        return planetasNeutrales;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public int getNumeroJugadores() {
        return NUMERO_JUGADORES;
    }

    public int numeroPlanetasTotales() {
        return numeroPlanetasTotales = NUMERO_JUGADORES + planetasNeutrales;
    }

    public Planeta[] planetasTotales() { //Creacion de un Arreglo de Planetas con el tamaño total de Planetas
        Planeta[] planetas = new Planeta[numeroPlanetasTotales()];
        return planetas;
    }
}
