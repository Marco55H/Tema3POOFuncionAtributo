package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
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
		
		Operaciones op = new Operaciones(num1,num2);
		switch(opc) {
		case 1:
			System.out.println("La suma de los números es " +op.suma()); 
			break;
		case 2:
			System.out.println("La resta de los números es " +op.resta());
			break;
		case 3:
			System.out.println("La multiplicación de los números es " +op.multiplicación());
			break;
		case 4:
			System.out.println("La división de los números es " +op.división());
			break;
		case 5:
			System.out.println("El número mayor es " +op.mayor());
			break;
		case 6:
			System.out.println("La número menor es " +op.menor());
			break;
		default:
		}
		sc.close();
	}

	
	public static int menu() {
		int opc;
		System.out.println("1- Suma");
		System.out.println("2- Resta");
		System.out.println("3- Multiplicación");
		System.out.println("4- División");
		System.out.println("5- Máximo");
		System.out.println("6- Mínimo");
		System.out.println("0- Salir");
		opc = sc.nextInt();
		return opc;
	}

	
	public static double pideNumero() {
		double num = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduce el número");
				num = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de número");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return num;
	}
}
