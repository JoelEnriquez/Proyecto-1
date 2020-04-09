package Constructores;

import Naves.Nave;

public class Constructor {
    
    private int turnosProduccion;
    private int precioAdquirir;
    private int precioVenta;
    private Nave tipoNave;

    
    public int getTurnosProduccion() {
        return turnosProduccion;
    }

    public void setTurnosProduccion(int turnosProduccion) {
        this.turnosProduccion = turnosProduccion;
    }

    public int getPrecioAdquirir() {
        return precioAdquirir;
    }

    public void setPrecioAdquirir(int precioAdquirir) {
        this.precioAdquirir = precioAdquirir;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Nave getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(Nave tipoNave) {
        this.tipoNave = tipoNave;
    }
    
    
}
