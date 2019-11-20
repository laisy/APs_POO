package ufrpe.Main;

import ufrpe.Circulo.*;
import ufrpe.Quadrilatero.*;

public class Main {
	public static void main(String args[]) {
		
		int lado = 2;
		Quadrilatero q = new Quadrado(lado);
		System.out.println("Area do Quadrado: " + q.calcularArea());
		System.out.println("Perimetro do Quadrado: " + q.calcularPerimetro() + "\n");
		
		int lado2 = 4;
		Quadrilatero q1 = new Retangulo(lado, lado2);
		System.out.println("Area do Retangulo: " + q1.calcularArea());
		System.out.println("Perimetro do Retangulo: " +  q1.calcularPerimetro() + "\n");
		
		int raio= 2;
		Circulo c = new Circulo(raio);
		System.out.println("Area do Circulo: " + c.calcularArea());
		System.out.println("Perimetro do Circulo: " + c.calcularPerimetro() + "\n");
		
	}
	
}
