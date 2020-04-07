package Planetas;

public class Radioactivo extends Planeta{
    
    public Radioactivo(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }

    public int generarSoldados() {
        int min= 3, max = 9;
        return super.generarSoldados(min, max);
    }
}
