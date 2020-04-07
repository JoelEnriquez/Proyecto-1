package Diseños;

import Planetas.Planeta;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiseñoPlanetas {

    Scanner leer = new Scanner(System.in);

    DiseñoMapa diseñarPlanetas = new DiseñoMapa();
    Planeta[] planetasTotales = diseñarPlanetas.planetasTotales();
    
    

    private int probabilidadAparicion() {
        int probabilidadAparicion = 0;
        probabilidadAparicion = (int) (Math.random() * 100 + 1);
        return probabilidadAparicion;
    }

    //Brinda el nombre de planeta aleatoriamente
    public String tipoPlaneta() {
        String nombrePlaneta = "";
        int probabilidadPlaneta = probabilidadAparicion();
        if (probabilidadPlaneta >= 1 && probabilidadPlaneta <= 45) {
            nombrePlaneta = "Tierra";
        } else if (probabilidadPlaneta >= 46 && probabilidadPlaneta <= 70) {
            nombrePlaneta = "Agua";
        } else if (probabilidadPlaneta >= 71 && probabilidadPlaneta <= 85) {
            nombrePlaneta = "Fuego";
        } else if (probabilidadPlaneta >= 86 && probabilidadPlaneta <= 95) {
            nombrePlaneta = "Organico";
        } else if (probabilidadPlaneta >= 96 && probabilidadPlaneta <= 100) {
            nombrePlaneta = "Radioactivo";
        }
        return nombrePlaneta;
    }

    public String asignarNombre() {
        String nombrePlaneta = "";

        do {
            System.out.println("Ingrese el nombre del Planeta");
            nombrePlaneta = leer.next();
        } while (validarNombre(nombrePlaneta) != false);

        return nombrePlaneta;
    }

    public String nombreAleatorio() {//Me lo compartio un cuate. Se llama Erick. Creditos a quien merece
        String nombrePlaneta = "";
        final int caracteres = 3;
        int menor = 65, maximo = 90 + 1;
        
        for (int i = 0; i < caracteres; i++) {
            int codigoAscii = ThreadLocalRandom.current().nextInt(menor, maximo);
            nombrePlaneta = nombrePlaneta + (char) codigoAscii;
        }
        
        return nombrePlaneta;
    }

    public boolean validarNombre(String nombrePlanet) {
        boolean nombreRepetido = false;
        String nombreActual = nombrePlanet;
                
        for (int i = 0; i < planetasTotales.length; i++) {
            if (planetasTotales[i].getNombre().equals(nombreActual)) {
                nombreRepetido = true;
            }
        }
        return nombreRepetido;
    }

    public int dineroInicial() {
        int dineroInicial = 0;
        do {
            System.out.println("Ingreso dinero inicial para este planeta");
            dineroInicial = leer.nextInt();
        } while (dineroInicial <= 0);

        return dineroInicial;
    }

    public int dineroAleatorio() {
        int dineroInicialRandom = 0;
        int min = 100, max = 500 + 1;

        dineroInicialRandom = ThreadLocalRandom.current().nextInt(min, max);
        return dineroInicialRandom;
    }

    public int cantidadConstructores() {
        int constructoresIniciales = 0;
        do {
            System.out.println("Ingrese la cantidad inicial de constructores");
            constructoresIniciales = leer.nextInt();
        } while (constructoresIniciales < 0);

        return constructoresIniciales;
    }

    public int cantidadNaves() {
        int navesIniciales = 0;
        do {
            System.out.println("Ingrese la cantidad inicial de naves");
            navesIniciales = leer.nextInt();
        } while (navesIniciales <= 0);

        return navesIniciales;
    }

    public int cantidadAleatoriaNaves() {
        int navesAleatorias = 0;
        int min = 1, max = 3 + 1;

        navesAleatorias = ThreadLocalRandom.current().nextInt(min, max);
        return navesAleatorias;
    }

    public int cantidadGuerreros() {
        int guerrerosIniciales = 0;
        do {
            System.out.println("Ingrese la cantidad de guerreros iniciales");
            guerrerosIniciales = leer.nextInt();
        } while (guerrerosIniciales <= 0);

        return guerrerosIniciales;
    }
    
    public int cantidadGuerrerosRandom(String planeta){
        Planeta metodo = new Planeta();
        int min= 0;
        int max = 0;
        
        if (planeta.equals("Tierra")) {
           min=15;
           max= 25;
        }
        else if (planeta.equals("Agua")) {
            min=12;
            max=23;
        }
        else if (planeta.equals("Fuego")) {
            min=10;
            max=20;
        }
        else if (planeta.equals("Organico")) {
            min=5;
            max=15;
        }
        else{
            min=3;
            max=9;
        }
        
        int guerrerosIniciales = metodo.generarSoldados(min, max);
                
       return guerrerosIniciales;
    }

    public double generarPorcentajeMuerte() {
        double porcentajeMuerte = 0;
        //Se va a ejecutar hasta que porcentajeMuerte sea diferente de 0
        do {
            porcentajeMuerte = Math.random();
        } while (porcentajeMuerte == 0);
        //Se redondea a 4 decimales el valor
        porcentajeMuerte = Math.round(porcentajeMuerte * 10000d) / 10000d;
        return porcentajeMuerte;
    }

    public Planeta instanciarPlaneta() {
        String tipoPlaneta = tipoPlaneta();
        String nombrePlaneta = asignarNombre();
        double porcentajeMuerte = generarPorcentajeMuerte();
        int cantidadDinero = dineroInicial();
        int cantidadConstructores = cantidadConstructores();
        int cantidadNaves = cantidadNaves();
        int cantidadGuerreros = cantidadGuerreros();

        Planeta nuevoPlanet = new Planeta();
        nuevoPlanet.retornarPlaneta(tipoPlaneta, nombrePlaneta, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);

        return nuevoPlanet;
    }

    public Planeta instanciarAleatorios() {
        String tipoPlaneta = tipoPlaneta();
        String nombrePlaneta = nombreAleatorio();
        double porcentajeMuerte = generarPorcentajeMuerte();
        int dineroInicialRandom = dineroAleatorio();
        final int constructorInicial = 1;
        int navesAleatorias = cantidadAleatoriaNaves();
        int guerrerosAleatorios = cantidadGuerrerosRandom(tipoPlaneta);

        Planeta planetaAleatorio = new Planeta();
        planetaAleatorio.retornarPlaneta(tipoPlaneta, nombrePlaneta, porcentajeMuerte, dineroInicialRandom, constructorInicial, navesAleatorias, guerrerosAleatorios);

        return planetaAleatorio;
    }

    public void editarBases() {
        //Nos permite editar las primeras dos posiciones del arreglo, que corresponder al numero de jugadores.
        for (int i = 0; i < diseñarPlanetas.getNumeroJugadores(); i++) {
            planetasTotales[i] = instanciarPlaneta();
        }

        if (diseñarPlanetas.getPlanetasNeutrales() == diseñarPlanetas.getNeutralesParaEditar()) { //Solo neutrales manuales
            for (int i = diseñarPlanetas.getNumeroJugadores(); i < diseñarPlanetas.getPlanetasNeutrales(); i++) {
                planetasTotales[i] = instanciarPlaneta();
            }

        } else if (diseñarPlanetas.getNeutralesParaEditar() == 0) {//Solo neutrales aleatorios
            for (int i = diseñarPlanetas.getNumeroJugadores(); i < diseñarPlanetas.getPlanetasNeutrales(); i++) {
                planetasTotales[i] = instanciarAleatorios();
            }
        } else { //Planetas neutrales que se editan y aleatorios
            for (int i = diseñarPlanetas.getNumeroJugadores(); i < diseñarPlanetas.getNeutralesParaEditar(); i++) {
                planetasTotales[i] = instanciarPlaneta();
            }

            for (int i = diseñarPlanetas.getNumeroJugadores() + diseñarPlanetas.getNeutralesParaEditar(); i < diseñarPlanetas.numeroPlanetasTotales(); i++) {
                planetasTotales[i] = instanciarAleatorios();
            }
        }

        //return planetasTotales;
    }

    
    //Cantidad de constructores=1. De tipo Obrero 
    //Cantidad de Naves (1-3). De tipo Naboo-1 
    //Saber que tipo de Planeta es. Este se instancia
    //Cantidad de Guerreros.Estos dependen del tipo de planeta
}
