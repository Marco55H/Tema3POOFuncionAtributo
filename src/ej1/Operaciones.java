package ej1;

public class Operaciones {
	double num1, num2;

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicación() {
		return num1 * num2;
	}

	public double división() {
		return num1 / num2;
	}

	public double mayor() {
	
		return num1>=num2 ? num1 : num2;

		}

	public double menor() {
		return num1<=num2 ? num1 : num2;
	}

}
