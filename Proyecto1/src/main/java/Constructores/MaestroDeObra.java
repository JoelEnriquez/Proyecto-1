package Constructores;

import Naves.Nave;
import Naves.X_Wing;

public class MaestroDeObra extends Constructor {
    private int turnosProduccion =2;
    private int precioAdquirir=100;
    private int precioVenta = 70;
    private Nave tipoNave = new X_Wing(); 

    
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
