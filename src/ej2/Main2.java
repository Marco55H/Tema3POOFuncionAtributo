package ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		double alto, ancho;
		Rectangulo rec;

		opc = menu();
		while (opc != 0) {
			alto = pideAlto();
			ancho = pideAncho();

			rec = new Rectangulo(ancho, alto);

			switch (opc) {
			case 1:

				System.out.println("El perímetro del rectángulo es " + rec.perimetro());
				break;
			case 2:
				System.out.println("El area del rectángulo es " + rec.area());
				break;
			}
		}
		System.out.println("Adiós, gracias por usar el programa");

		sc.close();
	}

	public static int menu() {
		int opc = 0;
		do {
			try {
				System.out.println("1- Perímetro");
				System.out.println("2- Area");
				System.out.println("0- Salir");
				opc = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Error de número");
			} finally {
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		return opc;
	}

	public static double pideAncho() {
		double ancho = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduce el ancho del rectángulo");
				ancho = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de número");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return ancho;

	}

	public static double pideAlto() {
		double alto = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduce el alto del rectángulo");
				alto = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de número");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return alto;

	}
}
