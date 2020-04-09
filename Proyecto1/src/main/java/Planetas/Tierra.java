package Planetas;

import Guerreros.Mole;

public class Tierra extends Planeta {
    private String nombre;
    private String propietario;
    private double porcentajeMuerte;
    private int cantidadDinero;
    private int cantidadConstructores;
    private int cantidadNaves;
    private int cantidadGuerreros;

        public Tierra(String nombre, String propietario, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }
  
    public int generarSoldados() {
        int min= 15, max = 25;
        return super.generarSoldados(min, max);
    }
    
    public int generarDinero(){
        int min = 50,max=100;
        int dineroGenerado = super.generarDinero(min, max);
        
        return dineroGenerado;
    }
    
    public Mole[] soldadosMole(){
        Mole[] numeroMoles = new Mole[generarSoldados()];
        return numeroMoles;
    }
}
