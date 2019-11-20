
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogo j = new Jogo("Corinthians",  1, "Palmeiras", 1);

        j.resultado();
        System.out.println("O vencedor foi: " + j.vencedor() );

        System.out.println("Digite o nome do time pra saber quantos gols foram feitos por ele: ");
        String time = sc.next();
        System.out.println("A quantidade de gols do " + time + " foi: " + j.gols(time) + " gol(s)");

    }
}
