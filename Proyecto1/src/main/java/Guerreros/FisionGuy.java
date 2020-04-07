package Guerreros;

public class FisionGuy extends Guerrero {

    private final double FACTOR_MUERTE = 1.95;
    private final int ESPACIO_EN_NAVE = 4;
    private double valorMuerte;

    public FisionGuy() {
        super(1.95, 4);
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
