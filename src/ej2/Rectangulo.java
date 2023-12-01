package ej2;

public class Rectangulo {
	double ancho, alto;
	
	
	
	public Rectangulo() {
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	
	public double perimetro() {
		return ((ancho*2)+(alto*2));
	}
	
	public double area() {
		return (ancho*alto);
	}
}
