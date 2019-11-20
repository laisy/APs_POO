package teste;
import back.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);
        double area, perimetro;

        System.out.println("Digite um NÚMERO para a ALTURA: ");
        retangulo.setAltura(sc.nextDouble());
        System.out.println("Digite um NÚMERO para a LARGURA: ");
        retangulo.setLargura(sc.nextDouble());

        System.out.println("\nA AREA do RETANGULO é: " + retangulo.area(retangulo.getAltura(), retangulo.getLargura()));
        System.out.println("O PERIMETRO do RETANGULO é: " + retangulo.perimetro(retangulo.getAltura(), retangulo.getLargura()));
    }
}
