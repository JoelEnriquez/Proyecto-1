
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Arcade {

    static boolean parametro = true;
    static boolean repetidor = true;
    static Scanner miScanner = new Scanner(System.in);
    final static int tamañoMejores = 15;
    static String listadoMejores[] = new String[tamañoMejores];
    static int punteosMaximos[] = new int[tamañoMejores];
    static String nombreJugador;
    static String jugadorGanador;
    static String escogerJuego = "";

    public static void main(String[] juego) {
        //Aqui va a ir la instruccion con parametro       
        System.out.println("Bienvenido!");
        if (juego.length == 1) {
            switch (juego[0]) {
                case "sopa":
                    escogerJuego = "1";
                    break;
                case "target":
                    escogerJuego = "2";
                    break;
                case "2048":
                    escogerJuego = "3";
                    break;
                default:
                    System.out.println("Se ingreso un parametro invalido");
                    parametro = false;
                    break;
            }
        } else {
            parametro = false;
        }

        menuPrincipal();
    }

    public static void menuPrincipal() {

//Menu principal
        do {
            if (!parametro) {
                System.out.println("Escoge una opcion");
                System.out.println("(1) Sopa de Letras \n(2) Target \n(3) 2048 \n(4) Punteos Maximos \n(5) Salir");
                escogerJuego = miScanner.next();
            }
            parametro = false;

            switch (escogerJuego) {
                case "1":
                    System.out.println("Sopa de Letras");
                    jugarSopaDeLetras();
                    break;
                case "2":
                    System.out.println("Target");
                    jugarTarget();
                    break;
                case "3":
                    System.out.println("2048");
                    jugar2048();
                    break;
                case "4":
                    System.out.println("Punteos Maximos");
                    punteosMaximos();
                    break;
                case "5":
                    System.out.println("Regrese Pronto");
                    System.exit(0);
                default:
                    System.out.println("No es un dijito aceptado");
                    break;
            }
        } while (repetidor = true);
    }

    //Este es el menu despues de cada juego
    public static void despuesJuego(String param) {
        System.out.println("\n\n\n(1) Jugar De Nuevo");
        System.out.println("(2) Escojer Otro Juego");
        System.out.println("(3) Salir");

        String opcionJuegoTerminado = miScanner.next();
        if (opcionJuegoTerminado.equals("1")) { //Para seguir jugando
            switch (param) {
                case "1":
                    jugarSopaDeLetras();
                    break;
                case "2":
                    jugarTarget();
                    break;
                case "3":
                    jugar2048();
                    break;
                  case"4":
                  punteosMaximos();
                  break;
            }
        }
        else if (opcionJuegoTerminado.equals("2")) {
            menuPrincipal();

        } else if (opcionJuegoTerminado.equals("3")) {
            System.exit(0);
        }
    }

    //Variables globales Sopa de Letras
    static String palabraMezclada;
    static boolean terminar = false;
    static String pista = "";

    //Juego de Sopa de Letras
    public static void jugarSopaDeLetras() {
        String palabraParaAdivinar;
        String Guiones = "";
        int tamañoPalabra;
        int oportunidades = 3;
        boolean ganar = false;

        System.out.println("\nEl objetivo del juego es adivinar la palabra que escriba el otro jugador");
        System.out.println("Ingrese su nombre");
        nombreJugador = miScanner.next();
        System.out.println("Buena suerte " + nombreJugador);

        palabraParaAdivinar = ingresarPalabra();//Regresa la palabra que se va a adivinar
        ayudaJugador();//Opcion si se quiere elegir tematica

        tamañoPalabra = palabraParaAdivinar.length();
        mezclarLetras(palabraParaAdivinar);
        Guiones = espaciosenBlanco(tamañoPalabra);//Mandarle al metodo la longitud de la palabra
        System.out.println("\n\n\n\n");//Para que el jugador no vea la palabra que ingresa el jugador en consola
        
        //Ejecutar el nucleo hasta que gane o pierda
        do {
            mostrarEnPantalla(oportunidades, Guiones);
            System.out.println("Adivina la palabra");
            String intento = miScanner.next();

            if (intento.equalsIgnoreCase(palabraParaAdivinar)) {
                System.out.println("Felicidades! Acertaste");
                ganar = true;

            } else {
                oportunidades--;
                if (oportunidades == 0) {
                    System.out.println("Que triste. No pudiste adivinar la palabra :(");
                    System.out.println("La palabra era: " + palabraParaAdivinar);
                    break;
                } else {
                    System.out.println("\n\n Incorrecto. Prueba de nuevo");
                }
            }

        } while (!ganar);

        despuesJuego("1");
    }

    public static String ingresarPalabra() {
        System.out.println("\nEscriba la palabra que quiere que " + nombreJugador + " adivine");
        String palabraParaAdivinar = miScanner.next();
        return palabraParaAdivinar;
    }

    public static String ayudaJugador() {
        System.out.println("\n¿Quieres darle a " + nombreJugador + " una pista de la palabra?");
        System.out.println("(1)Si \n(2)No");
        String ayuda = miScanner.next();

        if (ayuda.equals("1")) {
            System.out.println("\nEscribe una tematica para poder ayudar a " + nombreJugador);
            pista = miScanner.next();
        } else if (ayuda.equals("2")) {
            pista = "Sin ayuda";
        }
        return pista;
    }

    public static void mezclarLetras(String palabraParaAdivinar) {
        String palabraTemporal = "";
        boolean acabar = false;
        int[] numerosRevueltos = new int[palabraParaAdivinar.length()];

        for (int i = 0; i < palabraParaAdivinar.length(); i++) { //Lenar el arreglo de numeros
            numerosRevueltos[i] = i;
        }

        do {
            Random aleatorio = new Random();
            int temporal = aleatorio.nextInt(numerosRevueltos.length);
            palabraTemporal += palabraParaAdivinar.charAt(numerosRevueltos[temporal]) + "";
            numerosRevueltos = extraerElementos(numerosRevueltos, temporal);

            if (palabraTemporal.length() == palabraParaAdivinar.length()) {
                palabraMezclada = palabraTemporal;
                acabar = true;
            }
        } while (!acabar);

    }
    
//Se elimina el número  del random, para no volver a seleccionarlo en la proxima reiteracion del bucle
//Se sustituye el array original por el nuevo, ahí se hace el cambio
    public static int[] extraerElementos(int[] numerosRevueltos, int temporal) {
        int[] numerosNuevos = new int[numerosRevueltos.length - 1];
        int añadir = 0;
        for (int i = 0; i < numerosRevueltos.length; i++) {
            if (i != temporal) {
                numerosNuevos[añadir] = numerosRevueltos[i];
                añadir++;
            }
        }
        return numerosNuevos;
    }

    public static String espaciosenBlanco(int tamañoPalabra) {
        String Espacios = "";
        for (int i = 0; i < tamañoPalabra; i++) {
            Espacios += "_ ";
        }
        return Espacios;
    }

    public static void mostrarEnPantalla(int intentos, String Guiones) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_GREEN + "****************************************************");
        System.out.println("Intentos Restantes: " + intentos + "      Palabra Revuelta: " + palabraMezclada);
        System.out.println(Guiones + "           Pista: " + pista);
        System.out.println("____________________________________________________" + ANSI_RESET);
    }

    //Juego de Target
    public static void jugarTarget() {
        int numeroJugadores = 0;
        int punto = 0;
        int[] punteos;
        final int JUEGO_GANADO = 200;//Cantidad puntos para ganar

        System.out.println("\nEl objetivo del juego es alcanzar los 200 puntos mediante la suma de los tiros");
        while (repetidor) {
            System.out.println("Cuantas personas desean jugar?");
            System.out.println("(2-4 Jugadores)");
            numeroJugadores = miScanner.nextInt();
            if (numeroJugadores < 2) {
                System.out.println("Rango invalido");
            } else if (numeroJugadores > 4) {
                System.out.println("Rango invalido");
            } else {
                repetidor = false;
            }
        }

        punteos = new int[numeroJugadores];
        String[] jugadores = new String[numeroJugadores];//El numero de jugadores elegidos sera la capacidad

        for (int i = 0; i < numeroJugadores; i++) {
            System.out.println("Ingrese su nombre Jugador " + (i + 1));//Llenado de arreglo de jugadores
            jugadores[i] = miScanner.next();
        }
        System.out.println("\n");

        boolean turno = true;
        while (turno) {
            for (int i = 0; i < numeroJugadores; i++) {
                System.out.print("Es tu turno: " + jugadores[i] + "    ");
                System.out.println("Puntos actuales: " + punteos[i]);
                punto = Tiros();//Puntaje que logro
                System.out.println(dibujo(punto));//Dibujar el Blanco
                punteos[i] += punto;
                System.out.println("Ahora tienes " + punteos[i] + " puntos\n");

                if (punteos[i] >= JUEGO_GANADO) {
                    System.out.println("Felicidades " + jugadores[i] + "! Has ganado!");
                    turno = false;
                    break;
                } else {
                    System.out.println("\nSiguiente turno");
                }
            }
        }
        despuesJuego("2");
    }

    public static int Tiros() {
        String decision = "";
        boolean repetir = true;
        int tiro = 0;
        int punto = 0;
        String cuarentaPuntos = "Genial! Obtienes 40 puntos";
        String treintaPuntos = "Enhorabuena! Obtienes 30 puntos";
        String veintePuntos = "Puedes hacerlo mejor. Obtienes 20 puntos";
        String diezPuntos = "Algo es algo. Tienes 10 puntos";
        String ceroPuntos = "Que mala suerte! Has fallado por completo";

        while (repetir) {
            System.out.println("¿Que tipo de tiro desea realizar \n(1) Tiro rápido con el dardo arriba del brazo ");
            System.out.println("(2) Controlado con el dardo arriba del brazo \n(3) Con el dardo bajo el brazo");
            decision = miScanner.next();
            if (decision.equals("1")) {
                tiro = (int) (Math.random() * 2) + 1; //Random que nos dice el punto
                if (tiro == 2) {
                    System.out.println(cuarentaPuntos);
                    punto = 40;
                } else if (tiro == 1) {
                    System.out.println(ceroPuntos);
                    punto = 0;
                }
                repetir = false;

            } else if (decision.equals("2")) {
                tiro = (int) (Math.random() * 3) + 1;
                if (tiro == 3) {
                    System.out.println(treintaPuntos);
                    punto = 30;
                } else if (tiro == 2) {
                    System.out.println(veintePuntos);
                    punto = 20;
                } else if (tiro == 1) {
                    System.out.println(diezPuntos);
                    punto = 10;
                }
                repetir = false;

            } else if (decision.equals("3")) {
                tiro = (int) (Math.random() * 5) + 1;
                if (tiro == 5) {
                    System.out.println(cuarentaPuntos);
                    punto = 40;
                } else if (tiro == 4) {
                    System.out.println(treintaPuntos);
                    punto = 30;
                } else if (tiro == 3) {
                    System.out.println(veintePuntos);
                    punto = 20;
                } else if (tiro == 2) {
                    System.out.println(diezPuntos);
                    punto = 10;
                } else if (tiro == 1) {
                    System.out.println(ceroPuntos);
                    punto = 0;
                }
                repetir = false;

            } else {
                System.out.println("Opcion invalida. Elija una de las opciones mostradas");
            }
        }
        return punto;
    }

    public static String dibujo(int punto) {
        String draw = "";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        if (punto == 40) {
            draw = "    ________________\n"
                    + "   /                \\\n"
                    + "  /   ____________   \\\n"
                    + " /   /	          \\   \\\n"
                    + "/   /    _______   \\   \\\n"
                    + "|   |   /       \\   |   | \n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   |" + ANSI_RED + "   x" + ANSI_RESET + "   |   |   | \n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   \\_______/   |   | \n"
                    + "\\   \\               /   /\n"
                    + " \\   \\_____________/   / \n"
                    + "  \\                   / \n"
                    + "   \\_________________/";
        } else if (punto == 30) {
            draw = "    ________________\n"
                    + "   /                \\\n"
                    + "  /   ____________   \\\n"
                    + " /   /	          \\   \\\n"
                    + "/   /    _______   \\   \\\n"
                    + "|   |   /       \\   |   | \n"
                    + "|   |   | " + ANSI_RED + "x" + ANSI_RESET + "     |   |   | \n"
                    + "|   |   |   .   |   |   |\n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   \\_______/   |   | \n"
                    + "\\   \\               /   /\n"
                    + " \\   \\_____________/   / \n"
                    + "  \\                   / \n"
                    + "   \\_________________/";
        } else if (punto == 20) {
            draw = "    ________________\n"
                    + "   /                \\\n"
                    + "  /   ____________   \\\n"
                    + " /   /	          \\   \\\n"
                    + "/   /    _______   \\   \\\n"
                    + "|   |   /       \\   |   | \n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   |   .   |   |   |\n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   \\_______/   |   | \n"
                    + "\\   \\      " + ANSI_RED + "      x" + ANSI_RESET + "  /   /\n"
                    + " \\   \\_____________/   / \n"
                    + "  \\                   / \n"
                    + "   \\_________________/";
        } else if (punto == 10) {
            draw = "    ________________\n"
                    + "   /" + ANSI_RED + "   x" + ANSI_RESET + "            \\\n"
                    + "  /   ____________   \\\n"
                    + " /   /	          \\   \\\n"
                    + "/   /    _______   \\   \\\n"
                    + "|   |   /       \\   |   | \n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   |   .   |   |   |\n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   \\_______/   |   | \n"
                    + "\\   \\               /   /\n"
                    + " \\   \\_____________/   / \n"
                    + "  \\                   / \n"
                    + "   \\_________________/";
        } else {
            draw = "    ________________\n"
                    + "   /                \\\n"
                    + "  /   ____________   \\\n"
                    + " /   /	          \\   \\\n"
                    + "/   /    _______   \\   \\\n"
                    + "|   |   /       \\   |   | \n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   |   .   |   |   |\n"
                    + "|   |   |       |   |   | \n"
                    + "|   |   \\_______/   |   | \n"
                    + "\\   \\               /   /\n"
                    + " \\   \\_____________/   / \n"
                    + "  \\                   / \n"
                    + ANSI_RED + " x" + ANSI_RESET + " \\_________________/";
        }

        return draw;
    }

    //Juego de 2048
    final static int TABLERO_TAMAÑO = 4;
    static int tablero[][] = new int[TABLERO_TAMAÑO][TABLERO_TAMAÑO];
    static int punteo = 0;
    static String color = "";

    public static void jugar2048() {
        String verificar = "";
        boolean terminar = false;
        int contador = 0;

        System.out.println("\nEl objetivo del juego es alcanzar el puntaje de 2048, juntando numeros iguales para que se sumen");
        System.out.println("Ingrese su nombre");
        nombreJugador = miScanner.next();
        System.out.println("Buen suerte " + nombreJugador + "\n");

        matrizInicial();//generar la primera matriz con dos numeros

        while (!terminar) {
            mostrarJuego();
            verificar = miScanner.next();
            
            if (verificar.equals("t")) {
                terminar = true;
                break;
            }

            verificarMovimiento(verificar);
            generarAleatorio();

            for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                    if (tablero[i][j] == 2048) {
                        System.out.println("Felicidades " + nombreJugador + "! Has ganado :)");
                        terminar = true;
                    } else if (tablero[i][j] != 0) {
                        contador++;
                    }
                }
            }
           
            if (contador == 16) {
                System.out.println("Lo siento, perdiste " + nombreJugador);
                terminar = true;
            }
            
            
        }
        
        despuesJuego("3");
    }

    public static void imprimirTablero() {//Matriz base para dibujar todo
        for (int i = 0; i < TABLERO_TAMAÑO; i++) {
            System.out.println("================================");
            System.out.println("|      ||      ||      ||      |");
            for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                imprimirSoloNumeros(i, j);
            }
            System.out.println("");
            System.out.println("|      ||      ||      ||      |");
        }
        System.out.println("================================");

    }
//Impide que se muestren 0
    public static void imprimirSoloNumeros(int i, int j) {
        if (tablero[i][j] == 0) {
            System.out.print("|      |");
        } else if (tablero[i][j] != 0) {
            pintarNumeros(tablero[i][j]);
            System.out.print("| " + color + "    |");
        }
    }

    public static int numerosAleatorios() {
        int aleatorio = 0;

        aleatorio = (int) (Math.random() * 2);
        if (aleatorio == 0) {
            aleatorio = aleatorio + 2;
        }
        else if (aleatorio == 1) {
            aleatorio = aleatorio * 4;
        }
        return aleatorio;
    }

    public static void matrizInicial() {
        for (int i = 0; i < 2; i++) {
            generarAleatorio();
        }
    }

    public static void verificarMovimiento(String verificar) {
        if (verificar.equalsIgnoreCase("w")) {
            //Movimiento de abajo para arriba
            //Primer for de cada opcion sirve para mover un numero, entre varios 0
            for (int x = 0; x < 3; x++) {
                for (int i = 0; i < TABLERO_TAMAÑO - 1; i++) {
                    for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                        if (tablero[i][j] == 0) {
                            tablero[i][j] = tablero[i + 1][j];
                            tablero[i + 1][j] = 0;
                        }
                    }
                }
            }
            //Une iguales y le pone su punteo respecto, a la vez que junta los numeros
            for (int i = 0; i < TABLERO_TAMAÑO - 1; i++) {
                for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                    if (tablero[i][j] == tablero[i + 1][j]) {
                        tablero[i][j] = (tablero[i][j]) * 2;
                        tablero[i + 1][j] = 0;
                        punteo += tablero[i][j];
                    } else if (tablero[i][j] == 0) {
                        tablero[i][j] = tablero[i + 1][j];
                        tablero[i + 1][j] = 0;
                    }
                }
            }
            //No permite que se unan mas de 2 numeros y hace que se junten
            for (int i = 3; i > 0; i--) {
                for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                    if (tablero[i - 1][j] == 0) {
                        tablero[i - 1][j] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }

        } else if (verificar.equalsIgnoreCase("a")) {
            //Movimiento de derecha a izquierda
            for (int x = 0; x < 3; x++) {
                for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                    for (int j = 0; j < TABLERO_TAMAÑO - 1; j++) {
                        if (tablero[i][j] == 0) {
                            tablero[i][j] = tablero[i][j + 1];
                            tablero[i][j + 1] = 0;
                        }
                    }
                }
            }
            for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                for (int j = 0; j < TABLERO_TAMAÑO - 1; j++) {
                    if (tablero[i][j] == tablero[i][j + 1]) {
                        tablero[i][j] = (tablero[i][j]) * 2;
                        tablero[i][j + 1] = 0;
                        punteo += tablero[i][j];
                    } else if (tablero[i][j] == 0) {
                        tablero[i][j] = tablero[i][j + 1];
                        tablero[i][j + 1] = 0;
                    }
                }
            }
            for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                for (int j = 3; j > 0; j--) {
                    if (tablero[i][j - 1] == 0) {
                        tablero[i][j - 1] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }

        } else if (verificar.equalsIgnoreCase("s")) {
            //Movimiento de arriba para abajo
            for (int x = 0; x < 3; x++) {
                for (int i = 3; i > 0; i--) {
                    for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                        if (tablero[i][j] == 0) {
                            tablero[i][j] = tablero[i - 1][j];
                            tablero[i - 1][j] = 0;
                        }
                    }
                }
            }

            for (int i = 3; i > 0; i--) {
                for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                    if (tablero[i][j] == tablero[i - 1][j]) {
                        tablero[i][j] = (tablero[i][j]) * 2;
                        tablero[i - 1][j] = 0;
                        punteo += tablero[i][j];
                    } else if (tablero[i][j] == 0) {
                        tablero[i][j] = tablero[i - 1][j];
                        tablero[i - 1][j] = 0;
                    }
                }
            }

            for (int i = 0; i < TABLERO_TAMAÑO - 1; i++) {
                for (int j = 0; j < TABLERO_TAMAÑO; j++) {
                    if (tablero[i + 1][j] == 0) {
                        tablero[i + 1][j] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }

        } else if (verificar.equalsIgnoreCase("d")) {
            //Movimiento de izquierda a derecha
            for (int x = 0; x < 3; x++) {
                for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                    for (int j = 3; j > 0; j--) {
                        if (tablero[i][j] == 0) {
                            tablero[i][j] = tablero[i][j - 1];
                            tablero[i][j - 1] = 0;
                        }
                    }
                }
            }
            for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                for (int j = 3; j > 0; j--) {
                    if (tablero[i][j] == tablero[i][j - 1]) {
                        tablero[i][j] = (tablero[i][j]) * 2;
                        tablero[i][j - 1] = 0;
                        punteo += tablero[i][j];
                    } else if (tablero[i][j] == 0) {
                        tablero[i][j] = tablero[i][j - 1];
                        tablero[i][j - 1] = 0;
                    }
                }
            }
            for (int i = 0; i < TABLERO_TAMAÑO; i++) {
                for (int j = 0; j > TABLERO_TAMAÑO - 1; j++) {
                    if (tablero[i][j + 1] == 0) {
                        tablero[i][j + 1] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void generarAleatorio() {
        boolean permiso = false;

        while (!permiso) {
            int posicion_x = (int) (Math.random() * 4);//Posicion en que se coloca
            int posicion_y = (int) (Math.random() * 4);//el numero aleatorio
            if (tablero[posicion_x][posicion_y] == 0) {
                tablero[posicion_x][posicion_y] = numerosAleatorios();
                permiso = true;
            }
        }
    }

    public static void mostrarJuego() {
        imprimirTablero();
        System.out.println("Escoja una opcion:  |W|   |A|   |S|   |D|");
        System.out.println("Punteo: " + punteo);
        System.out.println("Terminar juego (t)");
    }

    public static void pintarNumeros(int numero) {
//Colores para los numeros
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_RESET = "\u001B[0m";

        if (numero == 2) {
            color = ANSI_BLACK + "2" + ANSI_RESET;
        } else if (numero == 4) {
            color = ANSI_RED + "4" + ANSI_RESET;
        } else if (numero == 8) {
            color = ANSI_GREEN + "8" + ANSI_RESET;
        } else if (numero == 16) {
            color = ANSI_YELLOW + "16" + ANSI_RESET;
        } else if (numero == 32) {
            color = ANSI_BLUE + "32" + ANSI_RESET;
        } else if (numero == 64) {
            color = ANSI_PURPLE + "64" + ANSI_RESET;
        } else if (numero == 128) {
            color = ANSI_CYAN + "128" + ANSI_RESET;
        } else if (numero == 256) {
            color = ANSI_WHITE + "256" + ANSI_RESET;
        } else if (numero == 512) {
            color = ANSI_BLACK + "512" + ANSI_RESET;
        } else if (numero == 1024) {
            color = ANSI_RED + "1024" + ANSI_RESET;
        } else if (numero == 2048) {
            color = ANSI_GREEN + "2048" + ANSI_RESET;
        }

    }

    //Para almacenar las personas que han ganado mas veces
    public static void punteosMaximos() {
        System.out.println("ESTAMOS TRABJANDO EN ELLO, VUELVA MAS TARDE");
        for (int i = 0; i < tamañoMejores; i++) {
            listadoMejores[i] = "-";
            punteosMaximos[i] = 0;
        }
        despuesJuego("4");
    }
}
