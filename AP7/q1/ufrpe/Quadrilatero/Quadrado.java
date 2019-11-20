package ufrpe.Quadrilatero;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(int lado1) {
		super(lado1, lado1, lado1, lado1);
	}
	
	@Override
	public double calcularArea() {
		double area;
		area = lado1 * lado1;
		return area;
	}
	

}
