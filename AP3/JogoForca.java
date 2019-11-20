
public class JogoForca {

    char[] palavra;
    String dica;
    int vida;
    char[] vetorPalavra;
    char[] erros;

    JogoForca(String palavra, String dica) {
        this.palavra = palavra.toCharArray();
        this.dica = dica;
        this.vida = 6;
        this.erros = new char[6];
    }

    void criarVetor(String palavra) {
        this.vetorPalavra = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            vetorPalavra[i] = '_';
        }
    }

    boolean conferirVida() {
        if (vida == 0) {
            return false;
        } else {
            return true;
        }
    }

    void decrementarVida(){
        vida --;
    }

    boolean conferirPalavra() {
        for (int i = 0; i < palavra.length; i++) {
            if(vetorPalavra[i] == '_') {
                return true;
            }
        }
        return false;
    }

    boolean conferirLetra(char letra) {
        boolean flag = false;
        for (int i = 0; i < palavra.length; i++) {
            if (palavra[i] == letra) {
                vetorPalavra[i] = letra;
                flag = true;
            }
        }
        return flag;

    }

    boolean letraJaDigitada (char letra){
        for (int i = 0; i < 6 - vida; i++) {
            if (erros[i] == letra) {
                return true;
            }
        }
        erros[vida - 1] = letra;
        return false;

    }

}
