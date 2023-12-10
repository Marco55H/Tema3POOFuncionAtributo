package ej3;

public class Circulo {
	//Iniciamos variables
		double radio;
		
		
		//Creamos el constructor sin atributos
		public Circulo() {
		}
		//Creamos el constructor con atributos
		public Circulo(double radio) {
			this.radio=radio;
		
		}
		//Creamos la clase perimetro para calcularlo con su formula
		public double circunferencia() {
			return (Math.PI * (radio*2));
		}
		//Creamos la clase area para calcularla con su formula
		public double area() {
			return (Math.PI * radio * radio);
		}

}
