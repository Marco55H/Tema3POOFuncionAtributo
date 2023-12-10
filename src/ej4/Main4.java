package ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
	//Creamos el scanner en la clase más importante
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Variable para la opción
		int opc;
		//Variables para el radio de la base y la altura
		double radioBase, altura;
		//Creamos objeto
		Cilindro cil;

		//Le damos a la variable opc el valor que nos devuelve la función menú
		opc = menu();
		
		//Mientras opc sea distinto de 0 seguimos con el programa
		while (opc != 0) {
			//Le damos a la variable radioBase el valor que nos devuelve la función pideRadioBase
			radioBase = pideRadioBase();
			//Le damos a la variable altura el valor que nos devuelve la función pideAltura
			altura = pideAltura();

			//Terminamos de crear el objeto, le damos los valores que necesita
			cil = new Cilindro(radioBase, altura);

			//Hacemos un switch que dependa de el valor de opc
			switch (opc) {
			//Si opc es 1 nos devuelve el perímetro del cilindro
			case 1:

				System.out.println("El vlomuen del cilindro es " + cil.volumen());
				break;
				//Si opc es 2 nos devuelve el area del cilindro
			case 2:
				System.out.println("El area del cilindro es " + cil.area());
				break;
			}
			//Volvemos a pedir una opción para seguir con el programa
			opc = menu();
		}
		//Cuando se salga del bucle, se dará cuando opc = 0 se imprimirá esto
		System.out.println("Adiós, gracias por usar el programa");

		//Cerramos escaner
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
				System.out.println("1- Volumen");
				System.out.println("2- Area");
				System.out.println("0- Salir");
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

	//Creamos otra función que pida el radio de la base
	public static double pideRadioBase() {
		//La variable que leeremos y devolverá la función
		double radioBase = 0;
		//Un booleano para ver si debemos pedir el número otra vez
		boolean seguir = true;
		//Hacemos un do while mientras el try catch para que se repita
		do {
			//Try catch para comprobar que el usuario introduzca un número válido
			try {
				//Pedimos el número
				System.out.println("Introduce el número");
				radioBase = sc.nextDouble();
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
		return radioBase;
	}

	//Creamos otra función que pida la altura
	public static double pideAltura() {
		//La variable que leeremos y devolverá la función
		double altura = 0;
		//Un booleano para ver si debemos pedir el número otra vez
		boolean seguir = true;
		//Hacemos un do while mientras el try catch para que se repita
		do {
			//Try catch para comprobar que el usuario introduzca un número válido
			try {
				//Pedimos el número
				System.out.println("Introduce el número");
				altura = sc.nextDouble();
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
		return altura;
	}
}

