package Tablero;


public class ImprimirTablero {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    private static final String[] LETRAS = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
    
    

    public void dibujarMapa(Mapa mapa){
        int auxiliar = 0;
        int contador = 0;
        int contador2 = 0;
        String apoyo="";
                
        
            for (int j = 0; j < mapa.getColumnas(); j++) {
                if (contador>=LETRAS.length) {
                    contador=0;
                    if (auxiliar>0) {
                        if (contador2>=LETRAS.length) {
                            contador2=1;                
                        }
                        else{                           
                        contador2++;
                        }
                    }
                }
                String textoImprimir="";
                apoyo="";
                if (auxiliar>0) {
                    textoImprimir+=LETRAS[contador2-1];
                }               
                textoImprimir+=LETRAS[contador];
                
                for (int k = 0; k < auxiliar+1; k++) {
                    apoyo+=LETRAS[LETRAS.length-1];
                }
                if (textoImprimir.equals(apoyo)) {
                    contador2++;
                    auxiliar++;
                }
                contador++;
                System.out.print("["+textoImprimir+"]");
            }
        
        
        String dibujo[][] = new String[mapa.getFilas()][mapa.getColumnas()];
        for (int filas = 0; filas < mapa.getFilas(); filas++) {
            for (int columnas = 0; columnas < mapa.getColumnas(); columnas++) {
                
            }
        }
    }
}
