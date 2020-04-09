
package Planetas;

import Constructores.Constructor;
import Guerreros.Guerrero;
import Naves.Nave;
import java.util.concurrent.ThreadLocalRandom;

    public class Planeta {
    
    private String nombre;
    private String propietario;
    private double porcentajeMuerte;
    private int cantidadDinero;
    private int cantidadConstructores;
    private int cantidadNaves;
    private int cantidadGuerreros;
    
    private Guerrero[] guerreros;
    private Nave[] naves;
    private Constructor[] constructor;


    public Planeta(String nombre, double porcentajeMuerte, int cantidadDinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros) {
        this.nombre = nombre;
        this.porcentajeMuerte = porcentajeMuerte;
        this.cantidadDinero = cantidadDinero;
        this.cantidadConstructores = cantidadConstructores;
        this.cantidadNaves = cantidadNaves;
        this.cantidadGuerreros = cantidadGuerreros;
    }
    
    public Planeta(){
        
    }
    
    public Planeta retornarPlaneta(String tipoP, String nombreP, double porcMuerte, int Dinero, int cantConst, int naves, int cantGuerr ){
          Planeta tipoPlaneta;
          
          if (tipoP.equals("Tierra")) {
            tipoPlaneta = new Tierra(nombreP, porcMuerte, Dinero, cantConst, naves, cantGuerr);
         }
          else if (tipoP.equals("Agua")) {
              tipoPlaneta = new Agua(nombreP, porcMuerte, Dinero, cantConst, naves, cantGuerr);
        }
          else if (tipoP.endsWith("Fuego")) {
              tipoPlaneta = new Fuego(nombreP, porcMuerte, Dinero, cantConst, naves, cantGuerr);     
        }
          else if (tipoP.equals("Organico")) {
            tipoPlaneta = new Organico(nombreP, porcMuerte, Dinero, cantConst, naves, cantGuerr);
        }
          else{
              tipoPlaneta = new Radioactivo(nombreP, porcMuerte, Dinero, cantConst, naves, cantGuerr);
          }
          
        return tipoPlaneta;
    }
    
    public int generarSoldados(int min, int max){
        int soldadosGenerados = 0;
        soldadosGenerados = ThreadLocalRandom.current().nextInt(min, max+1);
        return soldadosGenerados;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(double porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getCantidadConstructores() {
        return cantidadConstructores;
    }

    public void setCantidadConstructores(int cantidadConstructores) {
        this.cantidadConstructores = cantidadConstructores;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadGuerreros() {
        return cantidadGuerreros;
    }

    public void setCantidadGuerreros(int cantidadGuerreros) {
        this.cantidadGuerreros = cantidadGuerreros;
    }

}
