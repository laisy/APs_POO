import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        n1 = sc.nextDouble();

        System.out.println("Digite o 2° valor: ");
        n2 = sc.nextDouble();

        System.out.println("Digite o 3° valor: ");
        n3 = sc.nextDouble();

   
        NumMim n = new NumMim(n1, n2, n3);

        System.out.println("O numero minimo e: " + n.identificarMenor());
    }
}
