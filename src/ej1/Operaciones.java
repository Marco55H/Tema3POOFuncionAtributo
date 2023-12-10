package ej1;

//Creamos el constructor 
public class Operaciones {
	double num1, num2;

	//Les damos al objeto sus atributos
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
//Función para la suma
	public double suma() {
		//Devolvemos el valor de num1+num2
		return num1 + num2;
	}
	//Función para la resta
	public double resta() {
		//Devolvemos el valor de num1-num2
		return num1 - num2;
	}
	//Función para la multiplicación
	public double multiplicación() {
		//Devolvemos el valor de num1*num2
		return num1 * num2;
	}
	//Función para la división
	public double división() {
		//Devolvemos el valor de num1/num2
		return num1 / num2;
	}
	//Función para el número mayor
	public double mayor() {
		//Devolvemos el valor de la ternaria, si el num1 es mayor al num2 damos num1 sino damos num2
		return num1>=num2 ? num1 : num2;

		}
	//Función para el número menor
	public double menor() {
		//Devolvemos el valor de la ternaria, si el num1 es menor al num2 damos num1 sino damos num2
		return num1<=num2 ? num1 : num2;
	}

}
