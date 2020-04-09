package Guerreros;

public class Magma extends Guerrero {
    
    private final double FACTOR_MUERTE = 1.75;
    private final int ESPACIO_EN_NAVE = 2;
    private  double valorMuerte;

    public Magma(double porcentajeMuerte) {
        double factorMuerte = getFactorMuerte();
        int espacioEnNave = getEspacioEnNave();
        valorMuerte = porcentajeMuerte * factorMuerte;
    }

    @Override
    public double getFactorMuerte() {
        return FACTOR_MUERTE;
    }
    
    @Override
    public int getEspacioEnNave(){
        return ESPACIO_EN_NAVE;
    }

    @Override
    public double getValorMuerte(){
        return valorMuerte;
    }
}
