package Constructores;

import Naves.NabooN_1;
import Naves.Nave;


public class Obrero extends Constructor {
    
    private int turnosProduccion =3;
    private int precioAdquirir=50;
    private int precioVenta = 40;
    private Nave tipoNave = new NabooN_1(); 

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
