package Planetas;

public class Fuego extends Planeta {
    
    public Fuego(String nombre,String propietario, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre,propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }
    
    public int generarSoldados() {
        int min= 10, max = 20;
        return super.generarSoldados(min, max);
    }
    
    public int generarDinero(){
        int min = 70 ,max = 140;
        int dineroGenerado = super.generarDinero(min, max);
        return dineroGenerado;
    }
}
