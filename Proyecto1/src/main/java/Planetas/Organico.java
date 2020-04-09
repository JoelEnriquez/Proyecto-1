package Planetas;

import Constructores.Constructor;
import Constructores.Obrero;
import Guerreros.Groot;
import Guerreros.Guerrero;
import Naves.NabooN_1;
import Naves.Nave;

public class Organico extends Planeta{
    
    String nombre;
    String propietario;
    double porcentajeMuerte;
    int cantidadDinero;
    int cantidadConstructores;
    int cantidadNaves;
    int cantidadGuerreros;
    
    Guerrero[] guerrerosEnPlaneta;
    Nave[] navesEnPlaneta;
    Constructor[] constructoresEnPlaneta;

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
    
    public Guerrero crearSoldados(){
        Guerrero groot = new Groot(getPorcentajeMuerte());
        return groot;
    }
     
     public Nave crearNave(){
         Nave naboo = new NabooN_1();
         return naboo;
     }
        
    public void ingresarSoldadosIniciales(){
        guerrerosEnPlaneta = new Guerrero[getCantidadGuerreros()];
        for (int i = 0; i < guerrerosEnPlaneta.length; i++) {
            guerrerosEnPlaneta[i] = crearSoldados();
        }
    }
     
    public void ingresarNavesIniciales(){
        navesEnPlaneta = new Nave[getCantidadNaves()];
        for (int i = 0; i < navesEnPlaneta.length; i++) {
            navesEnPlaneta[i] = crearNave();
        }
    }
    
    public Constructor crearObrero(){
        Constructor obrero = new Obrero();
        return obrero;
    }
    
    public void ingresarConstructor(){
        constructoresEnPlaneta = new Constructor[getCantidadConstructores()];
        
        for (int i = 0; i < constructoresEnPlaneta.length; i++) {
            constructoresEnPlaneta[i] = crearObrero();
            
        }
    }
    
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
