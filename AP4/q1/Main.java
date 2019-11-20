import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Digite o a: ");
        a = sc.nextDouble();

        System.out.println("\n Digite o b: ");
        b = sc.nextDouble();

        NumeroComplexo n = new NumeroComplexo(a, b);

        System.out.println("\n Digite o a: ");
        a = sc.nextDouble();

        System.out.println("\n Digite o b: ");
        b = sc.nextDouble();

        NumeroComplexo n1 = new NumeroComplexo(a, b);

       n.multiplicacao(n1).imprimirNumComplx();

    }
}
