package Diseños;

import Planetas.Planeta;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiseñoPlanetas {

    private String nombreJ1;
    private String nombreJ2;
    private int planetasNeut;
    private int neutralesEdit;
    private int numPlanetasTotales;
    private final int NUMERO_JUGADORES = 2;

    public DiseñoPlanetas(String nombreJ1, String nombreJ2, int planetasNeut, int neutralesEdit, int numPlanetasTotales) {
        this.nombreJ1 = nombreJ1;
        this.nombreJ2 = nombreJ2;
        this.planetasNeut = planetasNeut;
        this.neutralesEdit = neutralesEdit;
        this.numPlanetasTotales = numPlanetasTotales;
    }

    Scanner leer = new Scanner(System.in);

    Planeta[] planetasTotales;

    public void asignarTamaño() { //Se manda a ejectuar para darle el tamaño inicial del numero total de planetas.
        planetasTotales= new Planeta[getNumPlanetasTotales()];
    }

    public Planeta[] retornarArrPlanetasTotales() {
        return planetasTotales;
    }

    private int probabilidadAparicion() {
        int probabilidadAparicion = 0;
        probabilidadAparicion = (int) (Math.random() * 100 + 1);
        return probabilidadAparicion;
    }

    //Brinda el nombre de planeta aleatoriamente basado en una probabilidad de Aparicion
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

    public String asignarNombre() { //Permite al usurio ingresar el nombre del planeta de turno
        String nombrePlaneta = "";

        do {
            System.out.println("Ingrese el nombre del Planeta");
            nombrePlaneta = leer.next();

        } while (validarNombre(nombrePlaneta) != false);

        return nombrePlaneta;
    }

    public String nombreAleatorio() { //Se brinda un nombre aleatorio a cualquier planeta de turno
        String nombrePlaneta = "";
        final int caracteres = 3;
        int menor = 65, maximo = 90 + 1; //Rango del codigo ASCIi de letras mayusculas

        for (int i = 0; i < caracteres; i++) {
            int codigoAscii = ThreadLocalRandom.current().nextInt(menor, maximo); //Numero random para dar una letra del codigo
            nombrePlaneta = nombrePlaneta + (char) codigoAscii; //Se van juntando las letras hasta formar una sola palabra.
        }

        return nombrePlaneta;
    }

    public boolean validarNombre(String nombrePlanet) {
        boolean nombreRepetido = false;
        String nombreActual = nombrePlanet;
        Planeta[] momentaneo = retornarArrPlanetasTotales(); //Nos brinda la informacion que hay en el arreglo principal

        for (int i = 0; i < momentaneo.length; i++) {

            if (momentaneo[i] != null) {
                if (momentaneo[i].getNombre().equals(nombreActual)) {
                    nombreRepetido = true;
                    System.out.println("Lo siento, el nombre ya existe. Ingrese uno valido");
                    break;
                }
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

    public int dineroAleatorio() { //Le brinda al planeta un dinero inicai entre ese rango
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

    public int cantidadGuerrerosRandom(String planeta) {
        Planeta metodo = new Planeta();
        int min = 0;
        int max = 0;

        if (planeta.equals("Tierra")) {
            min = 15;
            max = 25;
        } else if (planeta.equals("Agua")) {
            min = 12;
            max = 23;
        } else if (planeta.equals("Fuego")) {
            min = 10;
            max = 20;
        } else if (planeta.equals("Organico")) {
            min = 5;
            max = 15;
        } else {
            min = 3;
            max = 9;
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

    public Planeta instanciarPlaneta(String propietario) {
        String tipoPlaneta = tipoPlaneta();
        String nombrePlaneta = asignarNombre();
        double porcentajeMuerte = generarPorcentajeMuerte();
        int cantidadDinero = dineroInicial();
        int cantidadConstructores = cantidadConstructores();
        int cantidadNaves = cantidadNaves();
        int cantidadGuerreros = cantidadGuerreros();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        Planeta nuevoPlanet = new Planeta();
        Planeta planetaLleno;
        planetaLleno = nuevoPlanet.retornarPlaneta(tipoPlaneta, nombrePlaneta,propietario, porcentajeMuerte, cantidadDinero, cantidadConstructores, cantidadNaves, cantidadGuerreros);

        return planetaLleno;
    }

    public Planeta instanciarAleatorios(String neutral) {
        String tipoPlaneta = tipoPlaneta();
        String nombrePlaneta = nombreAleatorio();
        double porcentajeMuerte = generarPorcentajeMuerte();
        int dineroInicialRandom = dineroAleatorio();
        int constructorInicial = 1;
        int navesAleatorias = cantidadAleatoriaNaves();
        int guerrerosAleatorios = cantidadGuerrerosRandom(tipoPlaneta);

        Planeta planetaAleatorio = new Planeta();
        Planeta planetaRandom;
        planetaRandom =  planetaAleatorio.retornarPlaneta(tipoPlaneta, nombrePlaneta, neutral, porcentajeMuerte, dineroInicialRandom, constructorInicial, navesAleatorias, guerrerosAleatorios);

        return planetaRandom;
    }

    public Planeta[] editarBases() {
        Planeta[] llenadoPlanetas = planetasTotales;
        //Nos permite editar las primeras dos posiciones del arreglo, que corresponder al numero de jugadores.
        for (int i = 0; i < NUMERO_JUGADORES; i++) {
            if (i==0) {
                System.out.println("PLANETA DEL JUGADOR "+(i+1)+": "+getNombreJ1());
                llenadoPlanetas[i] = instanciarPlaneta(getNombreJ1());      
            }
            else{
                System.out.println("PLANETA DEL JUGADOR "+(i+1)+": "+getNombreJ2());
                llenadoPlanetas[i] = instanciarPlaneta(getNombreJ2());
            }
        }

        if (planetasNeut == neutralesEdit) { //Solo neutrales manuales
            for (int i = NUMERO_JUGADORES; i < numPlanetasTotales; i++) {
                System.out.println("PLANETA NEUTRAL: #"+(i-1));
                llenadoPlanetas[i] = instanciarPlaneta(getNeutral());
            }

        } else if (neutralesEdit == 0) {//Solo neutrales aleatorios
            for (int i = NUMERO_JUGADORES; i < numPlanetasTotales; i++) {
                llenadoPlanetas[i] = instanciarAleatorios(getNeutral());
            }
        } else { //Planetas neutrales que se editan y aleatorios
            for (int i = NUMERO_JUGADORES; i < NUMERO_JUGADORES + neutralesEdit; i++) {
                System.out.println("PLANETA NEUTRAL: #"+(i-1));
                llenadoPlanetas[i] = instanciarPlaneta(getNeutral());
            }

            for (int i = NUMERO_JUGADORES + neutralesEdit; i < numPlanetasTotales; i++) {
                llenadoPlanetas[i] = instanciarAleatorios(getNeutral());
            }
        }

        return llenadoPlanetas;
    }

    //Cantidad de constructores=1. De tipo Obrero 
    //Cantidad de Naves (1-3). De tipo Naboo-1 
    //Saber que tipo de Planeta es. Este se instancia
    //Cantidad de Guerreros.Estos dependen del tipo de planeta
    public String getNombreJ1() {
        return nombreJ1;
    }

    public void setNombreJ1(String nombreJ1) {
        this.nombreJ1 = nombreJ1;
    }

    public String getNombreJ2() {
        return nombreJ2;
    }

    public void setNombreJ2(String nombreJ2) {
        this.nombreJ2 = nombreJ2;
    }

    public int getPlanetasNeut() {
        return planetasNeut;
    }

    public void setPlanetasNeut(int planetasNeut) {
        this.planetasNeut = planetasNeut;
    }

    public int getNeutralesEdit() {
        return neutralesEdit;
    }

    public void setNeutralesEdit(int neutralesEdit) {
        this.neutralesEdit = neutralesEdit;
    }

    public int getNumPlanetasTotales() {
        return numPlanetasTotales;
    }

    public void setNumPlanetasTotales(int numPlanetasTotales) {
        this.numPlanetasTotales = numPlanetasTotales;
    }

    public Planeta[] getPlanetasTotales() {
        return planetasTotales;
    }

    public void setPlanetasTotales(Planeta[] planetasTotales) {
        this.planetasTotales = planetasTotales;
    }
    
    public String getNeutral(){
        return "Neutral";
    }
}
