package Constructores;

import Naves.MillenialFalcon;
import Naves.Nave;


public class Arquitecto extends Constructor {
    private int turnosProduccion =1;
    private int precioAdquirir=250;
    private int precioVenta = 175;
    private Nave tipoNave = new MillenialFalcon(); 

    
    public int getTurnosProduccion() {
        return turnosProduccion;
    }

    public int getPrecioAdquirir() {
        return precioAdquirir;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public Nave getTipoNave() {
        return tipoNave;
    }
}
