package ufrpe.Quadrilatero;

import ufrpe.Interface.IFormaGeometric;

public abstract class Quadrilatero implements IFormaGeometric{
	
	protected int lado1;
	protected int lado2;
	protected int lado3;
	protected int lado4;
	
	public Quadrilatero(int lado1, int lado2, int lado3, int lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro;
		perimetro = lado1 + lado2 + lado3 + lado4;
		return perimetro;
	}
	
	@Override
	public abstract double calcularArea ();
	
}
