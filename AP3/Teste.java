import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = "salmao massaricado";
        String dica = "comida";
        char letra;

        JogoForca jogo = new JogoForca(palavra, dica);
        jogo.criarVetor(palavra);

        while(jogo.conferirVida() && jogo.conferirPalavra()){
            System.out.println("\n");
            mostrarVida(jogo.vida);
            mostrarDica(jogo.dica);
            printarVetor(jogo.vetorPalavra, jogo.palavra);
            System.out.println("\n");

            System.out.println("\n Digite a letra: ");
            letra = sc.nextLine().toLowerCase().charAt(0);

            if(jogo.letraJaDigitada(letra)){
                System.out.println("Letra ja foi digitada! ");
            } else {
                if(jogo.conferirLetra(letra)){
                    System.out.println("Voce acertou a letra! ");

                } else {
                    jogo.decrementarVida();
                    System.out.println("Voce errou a letra! ");
                }
            }
        }

        System.out.println("A palavra e: " + palavra);
        if(!jogo.conferirVida()){
            System.out.println("Voce perdeu! ");
        } else{
            System.out.println("Voce ganhou, Parabéns! ");
        }

    }

    static void mostrarDica(String dica) {
        System.out.println("A DICA É: " + dica);
    }

    static void mostrarVida(int vida) {
        System.out.println("VIDAS: " + vida);
    }

    static void printarVetor(char[] vetorPalavra, char[] palavra) {
        for (int i=0; i<palavra.length; i++){
            System.out.print(vetorPalavra[i] + " ");
        }
    }


}
