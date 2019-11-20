package teste;
import back.Racional;

public class Main {
    public static void main(String[] args) {
        Racional fracao1 = new Racional(1,2);
        Racional fracao2 = new Racional(2,4);

        Racional fracao3;
        fracao3 = fracao1.somarFracao(fracao2);
        //fracao3.exibirDecimal();
        fracao3.exibirFracao();
    }
}
