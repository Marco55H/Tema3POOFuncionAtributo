package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
	//Creamos el scanner en la clase más importante
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Variable para la opción
		int opc;
		//Variable para el radio del circulo
		double radio;
		//Creamos el objeto
		Circulo rec;
		
		//Le damos a la variable opc el valor que nos devuelve la función menú
		opc = menu();
		
		//Mientras opc sea distinto de 0 seguimos con el programa
		while (opc != 0) {
			//Le damos a la variable radio el valor que nos devuelve la función pideRadio
			radio = pideRadio();
			//Terminamos de crear el objeto, le damos los valores que necesita
			rec = new Circulo(radio);

			//Hacemos un switch que dependa de el valor de opc
			switch (opc) {
			//Si opc es 1 nos devuelve el perímetro del circulo
			case 1:
				System.out.println("El perímetro del círculo es " + rec.circunferencia());
				break;
				
				//Si opc es 1 nos devuelve el area del circulo
			case 2:
				System.out.println("El area del círculo es " + rec.area());
				break;
			}
			//Volvemos a pedir una opciópara seguir con el programa
			opc = menu();
		}
		//Cuando se salga del bucle, se dará cuando opc = 0 se imprimirá esto
		System.out.println("Adiós, gracias por usar el programa");
		//Cerramos el escaner
		sc.close();
	}
	//Creamos la función menú
		public static int menu() {
			//Iniciamos opc que será el valor que el usuario introducirá
			int opc = 0;
			//Hacemos un do while mientras el try catch para que se repita
			do {
				//Try catch para comprobar que el usuario introduzca un número válido
				try {
					//Escribimos el menú y perdimos al usuario la opción
					System.out.println("1- Perímetro");
					System.out.println("2- Area");
					System.out.println("0- Salir");
					System.out.println("Introduce la opción");
					opc = sc.nextInt();
					//En caso de excepción
				} catch (InputMismatchException e) {
					System.out.println("Error de número");
					//En el finally limpiamos la variable
				} finally {
					sc.nextLine();
				}
				//Mientras opc sea distinto de 0 o de 2
			} while (opc < 0 || opc > 2);
			//devolvemos opc
			return opc;
		}

		//Creamos otra función que pida el ancho
		public static double pideRadio() {
			//La variable que leeremos y devolverá la función
			double radio = 0;
			//Un booleano para ver si debemos pedir el número otra vez
			boolean seguir = true;
			//Hacemos un do while mientras el try catch para que se repita
			do {
				//Try catch para comprobar que el usuario introduzca un número válido
				try {
					//Pedimos el número
					System.out.println("Introduce el número");
					radio = sc.nextDouble();
					//Booleana como falsa
					seguir = false;
					//Si se produce la excepción la booleana seguirá como verdadera y aparecerá este mensaje
				} catch (InputMismatchException e) {
					System.out.println("Error de número");
					//Limpiamos la variable en el finally 
				} finally {
					sc.nextLine();
				}
				//Si la booleana es  verdadera pedimos otra vez el número
			} while (seguir);
			//Devolvemos el número
			return radio;
		}

}
