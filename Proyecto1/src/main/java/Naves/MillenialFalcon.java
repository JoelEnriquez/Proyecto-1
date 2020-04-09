package Naves;

import Guerreros.Guerrero;

public class MillenialFalcon extends Nave {

    private final  double velocidadTransporte=1.5;
    private final  int capacidadTransporte = 58;
    private final int costoProduccion = 70;
    Guerrero[] guerrerosParaPelear;
    
    public MillenialFalcon() {
        int capacidadTrans = getCapacidadTransporte();
        double velocidadDesplazamiento = getVelocidadTransporte();
        int costoPro = getCostoProduccion();
    }

    @Override
    public double getVelocidadTransporte() {
        return velocidadTransporte;
    }

    @Override
    public int getCapacidadTransporte() {
        return capacidadTransporte;
    }

    @Override
    public Guerrero[] getGuerrerosParaPelear() {
        return guerrerosParaPelear;
    }

    public int getCostoProduccion() {
        return costoProduccion;
    }
    
}
