package Planetas;
import Guerreros.Guerrero;
import Guerreros.Nemo;

public class Agua extends Planeta {
    
    String nombre;
    String propietario;
    double porcentajeMuerte;
    int cantidadDinero;
    int cantidadConstructores;
    int cantidadNaves;
    int cantidadGuerreros;
    
    Guerrero[] guerrerosEnPlaneta;
    
    public Agua(String nombre,String propietario, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        super(nombre,propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);
    }

    public int generarSoldados() {
        int min= 12, max = 23;
        return super.generarSoldados(min, max);
    }
    
    public int generarDinero(){
        int min = 60 ,max = 120;
        int dineroGenerado = super.generarDinero(min, max);
        
        return dineroGenerado;
    }

   /* public Guerrero crearSoldados(){
        Guerrero nemo = new Nemo();
        return nemo;
    }
          */  
            
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public double getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    @Override
    public int getCantidadDinero() {
        return cantidadDinero;
    }

    @Override
    public int getCantidadConstructores() {
        return cantidadConstructores;
    }

    @Override
    public int getCantidadNaves() {
        return cantidadNaves;
    }

    @Override
    public int getCantidadGuerreros() {
        return cantidadGuerreros;
    }

    
}
