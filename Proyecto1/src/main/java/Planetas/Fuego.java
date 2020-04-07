package Planetas;

public class Fuego extends Planeta {
    
    public Fuego(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }
    
    public int generarSoldados() {
        int min= 10, max = 20;
        return super.generarSoldados(min, max);
    }
}
