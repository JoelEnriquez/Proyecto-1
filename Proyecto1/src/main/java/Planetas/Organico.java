package Planetas;

public class Organico extends Planeta{

    public Organico(String nombre, String propietario, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre,propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }
    
    public int generarSoldados() {
        int min= 5, max = 15;
        return super.generarSoldados(min, max);
    }
    
    public int generarDinero(){
        int min = 80 ,max = 160;
        int dineroGenerado = super.generarDinero(min, max);
        return dineroGenerado;
    }
}
