package ufrpe.Quadrilatero;

public class Retangulo extends Quadrilatero{
	
	public Retangulo(int lado1, int lado2) {
		super(lado1, lado1, lado2, lado2);
	}
	
	@Override
	public double calcularArea() {
		double area;
		area = lado1 * lado2;
		return area;
	}
	

}
