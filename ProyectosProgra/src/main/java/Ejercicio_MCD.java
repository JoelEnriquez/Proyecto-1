
public class Ejercicio_MCD {

    static int MCD;
    static int numero1;
    static int numero2;
    static int divisor; //Variable que compara ambos numeros
    static int maximoComunDivisor;

    public static void main(String[] numeros) {
        try {
            if (numeros.length != 2) {
                System.out.println("Parametros incorrectos");//No recibe mas o menos de dos parametros
            } else if (Integer.parseInt(numeros[0]) == 0 || Integer.parseInt(numeros[1]) == 0) {
                System.out.println("No es posible realizar. Hay un 0");
            } else {
                numero1 = Integer.parseInt(numeros[0]);//Primer numero de la primera posicion del arreglo
                numero2 = Integer.parseInt(numeros[1]);//Segundo numero de la segunda posicion del arreglo
                if (numero1 > numero2) {
                    divisor = numero1;
                    maximoComunDivisor = calcular_MCD();
                } else if (numero1 < numero2) {
                    divisor = numero2;
                    maximoComunDivisor = calcular_MCD();
                } else if (numero1 == numero2) {
                    maximoComunDivisor = numero1;
                }

                System.out.printf("%s %d \n", "El maximo comun divisor es", maximoComunDivisor); //Mensaje de resultado que muestra el MCD
            }
        } catch (Exception error) {
            System.out.println("Parametros invalidos"); //Captura varios errores, como ingresar datos de tipo String
        }

    }

    public static int calcular_MCD() {
        if (divisor > 1) {
            if (numero1 % divisor != 0) {       //Si no pasa por este proceso, no pasa a comparar con el otro numero
                divisor--;
                calcular_MCD();
            } else if (numero1 % divisor == 0) {
                if (numero2 % divisor != 0) {
                    divisor--;
                    calcular_MCD();
                } else if (numero2 % divisor == 0) {
                    MCD = divisor;
                }
            }
        } else if (divisor == 1) {
            MCD = divisor;
        }
        return MCD;
    }
}
