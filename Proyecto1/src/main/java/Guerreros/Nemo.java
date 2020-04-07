package Guerreros;

public class Nemo extends Guerrero{
    private final double FACTOR_MUERTE = 1.6;
    private final int ESPACIO_EN_NAVE = 1;
    private double valorMuerte;

    public Nemo() {
        super(1.6, 1);
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
