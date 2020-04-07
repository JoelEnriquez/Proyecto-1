/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Math.max;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pruebas {

    public static void main(String[] args) {
//       double porcentajeMuerte=0;
//        do {
//            porcentajeMuerte = Math.random();
//        } while (porcentajeMuerte==0);
//
//        porcentajeMuerte = Math.round(porcentajeMuerte*10000d)/10000d;
//         System.out.println(porcentajeMuerte);

//        Random r = new Random(1);
//        double valorDado = r.nextDouble();
//        System.out.println(valorDado);
        int prueba = (int) ((Math.random() * 500 + 100) - 100);
        System.out.println(prueba);

        Random aleatorio = new Random();
        System.out.println(100 + aleatorio.nextInt((500 + 1) - 100));
        System.out.println(aleatorio.nextInt()*501+100);

        int min = 100, max = 500 + 1;
        int numeroRandom = ThreadLocalRandom.current().nextInt(min, max);
        System.out.println(numeroRandom);

        
    }
}

/* private static int probabilidadAparicion(){
        int probabilidadAparicion = 0;
        probabilidadAparicion = (int)(Math.random()*100+1);  
        return probabilidadAparicion;
    }

    public static String tipoPlaneta(){
        String nombrePlaneta="";
        int probabilidadPlaneta = probabilidadAparicion();
        if (probabilidadPlaneta>=1&&probabilidadPlaneta<=45) {
            nombrePlaneta="Tierra";
        }
        else if (probabilidadPlaneta>=46&&probabilidadPlaneta<=70) {
            nombrePlaneta="Agua";
        }
        else if (probabilidadPlaneta>=71&&probabilidadPlaneta<=85) {
            nombrePlaneta="Fuego";
        }
        else if (probabilidadPlaneta>=86&&probabilidadPlaneta<=95) {
            nombrePlaneta="Organico";
        }
        else if (probabilidadPlaneta>=96&&probabilidadPlaneta<=100) {
            nombrePlaneta="Radioactivo";
        }
        return nombrePlaneta;
 */
