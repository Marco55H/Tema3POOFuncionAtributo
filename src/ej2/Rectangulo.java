package ej2;

public class Rectangulo {
	//Iniciamos variables
	double ancho, alto;
	
	
	//Creamos el constructor sin atributos
	public Rectangulo() {
	}
	//Creamos el constructor con atributos
	public Rectangulo(double ancho, double alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	//Creamos la clase perimetro para calcularlo con su formula
	public double perimetro() {
		return ((ancho*2)+(alto*2));
	}
	//Creamos la clase area para calcularla con su formula
	public double area() {
		return (ancho*alto);
	}
}
