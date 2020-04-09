package Planetas;

import Guerreros.Mole;

public class Tierra extends Planeta {
    private String nombre;
    private double porcentajeMuerte;
    private int cantidadDinero;
    private int cantidadConstructores;
    private int cantidadNaves;
    private int cantidadGuerreros;
            
    Mole soldadoMole = new Mole();
    
    public Tierra(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        this.nombre = nombre;
        this.porcentajeMuerte = porcentajeMuerte;
        this.cantidadDinero = cantidadDinero;
        this.cantidadConstructores = cantidadConstructores;
        this.cantidadNaves = cantidadNaves;
        this.cantidadGuerreros = cantidadGuerreros;
    }
    
    public int generarSoldados() {
        int min= 15, max = 25;
        return super.generarSoldados(min, max);
    }
    
    public Mole[] soldadosMole(){
        Mole[] numeroMoles = new Mole[generarSoldados()];
        return numeroMoles;
    }
}
