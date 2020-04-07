package Tablero;
import Planetas.Planeta;

public class Mapa {
    private int filas;
    private int columnas;
    private int numeroNeutrales;
    private int numeroBases;
    private Planeta[] planetas;

    
    public Mapa(int filas, int columnas, int numeroNeutrales, Planeta[] planetas) {
        this.filas = filas;
        this.columnas = columnas;
        this.numeroNeutrales = numeroNeutrales;
        this.planetas=planetas;
    }

    public Planeta[] getPlanetas() {
        return planetas;
    }

    public void setPlanetas(Planeta[] planetas) {
        this.planetas = planetas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getNumeroNeutrales() {
        return numeroNeutrales;
    }

    public void setNumeroNeutrales(int numeroNeutrales) {
        this.numeroNeutrales = numeroNeutrales;
    }

    public int getNumeroBases() {
        return numeroBases;
    }

    public void setNumeroBases(int numeroBases) {
        this.numeroBases = numeroBases;
    }

}
