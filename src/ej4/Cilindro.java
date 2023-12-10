package ej4;

public class Cilindro {
	//Iniciamos variables
	double radioBase, altura;
	
	
	//Creamos el constructor sin atributos
	public Cilindro() {
	}
//Creamos el constructor sin atributos
	public Cilindro(double radioBase, double altura) {
		this.radioBase=radioBase;
		this.altura=altura;
	}
	//Creamos la fuinción del volumen del cilindro
	public double volumen() {
		return (Math.PI * (radioBase*radioBase) * altura);
	}
	//Creamos la fuinción del area del cilindro
	public double area() {
		return (2*Math.PI * radioBase * altura + 2* Math.PI * (radioBase*radioBase) );
}
}
