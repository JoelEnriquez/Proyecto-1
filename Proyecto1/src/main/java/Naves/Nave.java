package Naves;
import Guerreros.Guerrero;


public class Nave {
    private double velocidadTransporte;
    private int capacidadTransporte;
    Guerrero[] guerrerosParaPelear;
    //Las naves son producidad por los constructores

    public Nave(double velocidadTransporte, int capacidadTransporte, Guerrero[] guerrerosParaPelear) {
        this.velocidadTransporte = velocidadTransporte;
        this.capacidadTransporte = capacidadTransporte;
        this.guerrerosParaPelear = guerrerosParaPelear;
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
    
    
}
