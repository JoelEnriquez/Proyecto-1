package Guerreros;

public class Mole extends Guerrero{
    private final double FACTOR_MUERTE = 1.5;
    private final int ESPACIO_EN_NAVE = 1;
    private double valorMuerte;

    public Mole(){
        super(1.5, 1);              
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
