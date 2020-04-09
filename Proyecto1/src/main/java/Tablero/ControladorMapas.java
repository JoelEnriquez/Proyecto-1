package Tablero;

public class ControladorMapas {
    private Mapa[] mapas=new Mapa[1]; //Guarda los mapas del Juego
    Mapa nuevoMapa;

    public void ingresarMapa(){
        for (int i = 0; i < mapas.length; i++) {
            mapas[i]=nuevoMapa;
        }
    }
    
    public Mapa[] nuevoArray(){
        Mapa[] arregloProvisional=null;
        return arregloProvisional;
    }
    
    public Mapa[] getMapas() {
        return mapas;
    }

    public void setMapas(Mapa[] mapas) {
        this.mapas = mapas;
    }
    
    public void setMapa(Mapa nuevoMapa){
        this.nuevoMapa = nuevoMapa;
    }
    
   /* public int modificarTamaño(){
        int tamañoActual = 0;
        if (mapas.length==0) {
            tamañoActual=1;
        }
        else{
            
        }
        return 0;
    }
*/
    
    
    
}

