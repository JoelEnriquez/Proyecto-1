package Casillas;


public class ServicioBasico extends Propiedad{
    
    public ServicioBasico(int precioCompra, int precioHipoteca) {
        super(precioCompra, precioHipoteca);
    }

    @Override
    public void cobrarRenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
