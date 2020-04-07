package Planetas;

public class Agua extends Planeta {
    
    public Agua(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }

    public int generarSoldados() {
        int min= 12, max = 23;
        return super.generarSoldados(min, max);
    }
    
    
}
