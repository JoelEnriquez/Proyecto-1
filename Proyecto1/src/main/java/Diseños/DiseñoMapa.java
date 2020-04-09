package Diseños;

import Planetas.Planeta;
import Tablero.Mapa;

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

    public void ejecutarCreacionPlanetas() {
        elaborarPlanetas();
    }

    public Planeta[] elaborarPlanetas() {
        Planeta[] planetasNuevos = new Planeta[numeroPlanetasTotales()];
        
        DiseñoPlanetas nuevoPlaneta = new DiseñoPlanetas(nombreJugador1, nombreJugador2, planetasNeutrales, neutralesParaEditar, numeroPlanetasTotales());  
        nuevoPlaneta.asignarTamaño();
        planetasNuevos = nuevoPlaneta.editarBases();

        return planetasNuevos;
    }
    
    public Mapa crearMapa(){
        Mapa nuevoMapa = new Mapa(getFilas(), getColumnas(), getPlanetasNeutrales(),elaborarPlanetas());
        return nuevoMapa;
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
}
