package Guerreros;


public class Groot extends Guerrero{

    private final double FACTOR_MUERTE = 1.85;
    private final int ESPACIO_EN_NAVE = 3;
    double valorMuerte;
    
    public Groot() {
        super(1.85, 3);
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
