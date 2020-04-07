package Guerreros;

public class Guerrero {
    
    private double factorMuerte;
    private double valorMuerte;
    private int espacioEnNave;

    public Guerrero(double factorMuerte, int espacioEnNave) {
        this.factorMuerte = factorMuerte;
        this.espacioEnNave = espacioEnNave;
    }

    public double getFactorMuerte() {
        return factorMuerte;
    }

    public void setFactorMuerte(double factorMuerte) {
        this.factorMuerte = factorMuerte;
    }

    public double getValorMuerte() {
        return valorMuerte;
    }

    public void setValorMuerte(double valorMuerte) {
        this.valorMuerte = valorMuerte;
    }

    public int getEspacioEnNave() {
        return espacioEnNave;
    }

    public void setEspacioEnNave(int espacioEnNave) {
        this.espacioEnNave = espacioEnNave;
    }
}
