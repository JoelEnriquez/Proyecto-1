package Guerreros;

public class Nemo extends Guerrero{
    private double FACTOR_MUERTE = 1.6;
    private  int ESPACIO_EN_NAVE = 1;
    private double valorMuerte;

    
        double factorMuerte = FACTOR_MUERTE;
        int espacioEnNave = ESPACIO_EN_NAVE;

    public Nemo(double factorMuerte, int espacioEnNave) {
        super(factorMuerte, espacioEnNave);
    }

    @Override
    public double getValorMuerte() {
        return valorMuerte;
    }

    @Override
    public void setValorMuerte(double valorMuerte) {
        this.valorMuerte = valorMuerte;
    }

}
