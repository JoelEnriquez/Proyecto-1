package Constructores;

import Naves.Nave;
import Naves.StarDestroyer;


public class Ingeniero extends Constructor {
    
    private int turnosProduccion =1;
    private int precioAdquirir=300;
    private int precioVenta = 200;
    private Nave tipoNave = new StarDestroyer(); 

    
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
