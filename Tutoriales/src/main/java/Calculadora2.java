import java.util.Scanner;
public class Calculadora2 {

    public static void main(String[] args) {
        		Scanner miScanner=new Scanner(System.in);

		System.out.println("¿Que operacion desea realizar? \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");

		int eleccion=miScanner.nextInt();
		int firstNumber;
		int secondNumber;
		int result;

			if(eleccion==1){
				System.out.println("Elija su primer numero");
				firstNumber=miScanner.nextInt();
				System.out.println("Elija su segundo numero");
				secondNumber=miScanner.nextInt();
				result=firstNumber+secondNumber;
				System.out.println("El resultado de sumar "+firstNumber+" mas " +secondNumber+ " es igual a "+result);
			}

				else if(eleccion==2){
					System.out.println("Elija su primer numero");
					firstNumber=miScanner.nextInt();
					System.out.println("Elija su segundo numero");
					secondNumber=miScanner.nextInt();
					result=firstNumber-secondNumber;
					System.out.println("El resultado de restar "+firstNumber+" menos " +secondNumber+ " es igual a "+result);					
				}

				else if (eleccion==3){
					System.out.println("Elija su primer numero");
					firstNumber=miScanner.nextInt();
					System.out.println("Elija su segundo numero");
					secondNumber=miScanner.nextInt();
					result=firstNumber-secondNumber;
					System.out.println("El resultado de multiplicar "+firstNumber+" por " +secondNumber+ " es igual a "+result);
				}

                                else if (eleccion==4){
					System.out.println("Elija su primer numero");
					firstNumber=miScanner.nextInt();
					System.out.println("Elija su segundo numero");
					secondNumber=miScanner.nextInt();
					result=firstNumber/secondNumber;
					System.out.println("El resultado de dividir "+firstNumber+" entre " +secondNumber+ " es igual a "+result);
				}
			
	}	
    }
