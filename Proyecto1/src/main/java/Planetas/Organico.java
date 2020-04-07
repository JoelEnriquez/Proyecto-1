package Planetas;

public class Organico extends Planeta{

    public Organico(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }
    
    public int generarSoldados() {
        int min= 5, max = 15;
        return super.generarSoldados(min, max);
    }
}
