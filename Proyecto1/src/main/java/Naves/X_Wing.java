package Naves;

import Guerreros.Guerrero;

public class X_Wing extends Nave{
    
    private final  double velocidadTransporte=1.25;
    private final  int capacidadTransporte = 42;
    private final int costoProduccion = 50;
    
    Guerrero[] guerrerosParaPelear;
    
    public X_Wing() {
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
