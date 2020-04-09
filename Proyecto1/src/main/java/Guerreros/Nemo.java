package Guerreros;

public class Nemo extends Guerrero{
    private final double FACTOR_MUERTE = 1.6;
    private final  int ESPACIO_EN_NAVE = 1;
    private double valorMuerte;

    public Nemo(double porcentajeMuerte) {
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
