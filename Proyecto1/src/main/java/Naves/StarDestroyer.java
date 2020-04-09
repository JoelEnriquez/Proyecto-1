package Naves;

import Guerreros.Guerrero;

public class StarDestroyer extends Nave{
    
    private final  double velocidadTransporte=1.75;
    private final  int capacidadTransporte = 80;
    private final int costoProduccion = 100;
    
    Guerrero[] guerrerosParaPelear;
    
    public StarDestroyer(){
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
