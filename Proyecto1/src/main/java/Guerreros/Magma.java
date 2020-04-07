package Guerreros;


public class Magma extends Guerrero {
    
    private final double FACTOR_MUERTE = 1.75;
    private final int ESPACIO_EN_NAVE = 2;
    double valorMuerte;

    public Magma() {
        super(1.75, 2);
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
