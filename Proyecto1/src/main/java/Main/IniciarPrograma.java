package Main;

import Diseños.DiseñoPlanetas;

public class IniciarPrograma {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Konquest!");
        EmpezarJuego empezar = new EmpezarJuego();
        empezar.iniciar();
        
        //Mapa mapa = new Mapa(30,600,6,);
        //ImprimirTablero imprimir = new ImprimirTablero();
        //imprimir.dibujarMapa(mapa);

    }
}

//            while (!salir) {
//            System.out.println("1 crear Mapa");
//            switch (opcion) {
//                case "1":
//           crarMapa hola = new crearMapa();
//                    break;
//        String meLaPelas;
//        for (int i = 65; i < 91; i++) {
//            meLaPelas = Character.toString((char)(i));
//            System.out.println(meLaPelas);
