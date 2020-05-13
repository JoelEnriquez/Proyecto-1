package Casillas;

import EntidadesDinero.Jugador;

public abstract class  Propiedad extends Casilla {

    protected Jugador jugadorDueño;
    protected String nombrePropiedad;
    protected int precioCompra;
    protected int precioHipoteca;
    protected boolean estadoPropiedad;

   public abstract void cobrarRenta();
   
    public void precioCompra(){
        
    }
 
    public void hipotecarPropiedad () throws Exception{
        if (estadoPropiedad==false) {
            throw new Exception("La propiedad ya se encuentra hipotecada");
        }
        else{
            
        }
    }
    
    public int dineroPorHipoteca(){
        return precioHipoteca;
    }
    
    public void pagarHipoteca() throws Exception{
        if (jugadorDueño.getCantidadDinero()<precioHipoteca) {
            throw new Exception("No tiene suficiente dinero para pagar la hipoteca");
        }
    }
    
    
    public Propiedad(int precioCompra, int precioHipoteca) {
        this.precioCompra = precioCompra;
        this.precioHipoteca = precioHipoteca;
    }

    public Jugador getJugadorDueño() {
        return jugadorDueño;
    }

    public void setJugadorDueño(Jugador jugadorDueño) {
        this.jugadorDueño = jugadorDueño;
    }

    public boolean getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(boolean estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    
    
}
