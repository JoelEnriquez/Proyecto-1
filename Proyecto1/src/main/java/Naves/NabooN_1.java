package Naves;

import Guerreros.Guerrero;

public class NabooN_1 extends Nave{
    private final  double velocidadTransporte=1;
    private final  int capacidadTransporte = 25;
    private final int costoProduccion = 40;
    Guerrero[] guerrerosParaPelear;
    
    public NabooN_1() {
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
