package Naves;
import Guerreros.Guerrero;


public class Nave {
    private double velocidadTransporte;
    private int capacidadTransporte;
    private int costoProduccion;
    
    Guerrero[] guerrerosParaPelear;
    //Las naves son producidad por los constructores

    public Nave() {
        getCapacidadTransporte();
        getCostoProduccion();
        getVelocidadTransporte();
    }

    public double getVelocidadTransporte() {
        return velocidadTransporte;
    }

    public void setVelocidadTransporte(double velocidadTransporte) {
        this.velocidadTransporte = velocidadTransporte;
    }

    public int getCapacidadTransporte() {
        return capacidadTransporte;
    }

    public void setCapacidadTransporte(int capacidadTransporte) {
        this.capacidadTransporte = capacidadTransporte;
    }

    public Guerrero[] getGuerrerosParaPelear() {
        return guerrerosParaPelear;
    }

    public void setGuerrerosParaPelear(Guerrero[] guerrerosParaPelear) {
        this.guerrerosParaPelear = guerrerosParaPelear;
    }

    public int getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(int costoProduccion) {
        this.costoProduccion = costoProduccion;
    }
}
