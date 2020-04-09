package Planetas;

public class Radioactivo extends Planeta{
    
    public Radioactivo(String nombre,String propietario, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre,propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }

    public int generarSoldados() {
        int min= 3, max = 9;
        return super.generarSoldados(min, max);
    }
    
    public int generarDinero(){
        int min = 90 ,max = 180;
        int dineroGenerado = super.generarDinero(min, max);
        
        return dineroGenerado;
    }
}
