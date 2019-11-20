package ufrpe.Circulo;

import ufrpe.Interface.IFormaGeometric;

public class Circulo implements IFormaGeometric{
	
	private double raio;
	private double pi = 3.14;

	public Circulo(float raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		double area;
		area = pi * (raio * raio);
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro;
		perimetro = 2 * pi * raio;
		return perimetro;
	}
	
}
