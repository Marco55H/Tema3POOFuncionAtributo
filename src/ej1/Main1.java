package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	//Creamos el scanner en la clase más importante
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variables de los 2 números usados
		double num1, num2;
		// Variable de la opción del menú
		int opc;

		// Menu según opc
		opc = menu();

		// Los dos números, llamamos a la función dos veces una cada número
		num1 = pideNumero();
		num2 = pideNumero();
		
		//Creamos el objeto op
		Operaciones op = new Operaciones(num1,num2);
		
		//Hacemos un switc para usar una función u otra según la opción elegida
		switch(opc) {
		//En este caso es la funcion que hace la suma de los números
		case 1:
			System.out.println("La suma de los números es " +op.suma()); 
			break;
			//En este caso es la funcion que hace la resta de los números
		case 2:
			System.out.println("La resta de los números es " +op.resta());
			break;
			//En este caso es la funcion que hace la multiplicación de los números
		case 3:
			System.out.println("La multiplicación de los números es " +op.multiplicación());
			break;
			//En este caso es la funcion que hace la división de los números
		case 4:
			System.out.println("La división de los números es " +op.división());
			break;
			//En este caso es la funcion que hace la comparación de los números y deja al mayor
		case 5:
			System.out.println("El número mayor es " +op.mayor());
			break;
			//En este caso es la funcion que hace la comparación de los números y deja al menor
		case 6:
			System.out.println("La número menor es " +op.menor());
			break;
		}
		//Cerramos el escaner en el main
		sc.close();
	}

	//Creamos una función para crear el menú
	public static int menu() {
		//Iniciamos la variable opc
		int opc;
		//Escribimos el menú para que el usuario sepa que opción eligió
		System.out.println("1- Suma");
		System.out.println("2- Resta");
		System.out.println("3- Multiplicación");
		System.out.println("4- División");
		System.out.println("5- Máximo");
		System.out.println("6- Mínimo");
		System.out.println("0- Salir");
		//Limpiamos opc
		opc = sc.nextInt();
		//Devolvemos el valor de opc
		return opc;
	}

	//Creamos otra función que pida el número
	public static double pideNumero() {
		//La variable que leeremos y devolverá la función
		double num = 0;
		//Un booleano para ver si debemos pedir el número otra vez
		boolean seguir = true;
		//Hacemos un do while mientras el try catch para que se repita
		do {
			//Try catch para comprobar que el usuario introduzca un número válido
			try {
				//Pedimos el número
				System.out.println("Introduce el número");
				num = sc.nextDouble();
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
		return num;
	}
}
