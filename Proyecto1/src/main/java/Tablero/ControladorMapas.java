package Tablero;

public class ControladorMapas {
    private Mapa[] mapas; //Guarda los mapas del Juego

    public ControladorMapas() {
        mapas = new Mapa[0];
    }

    public Mapa[] getMapas() {
        return mapas;
    }

    public void setMapas(Mapa[] mapas) {
        this.mapas = mapas;
    }
}
