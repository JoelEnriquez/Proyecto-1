package Planetas;

import Guerreros.Mole;

public class Tierra extends Planeta {
    
    Mole soldadoMole = new Mole();
    
    public Tierra(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
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
