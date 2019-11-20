import java.lang.Math;
/**
 * Essa classe cria um objeto de tres numeros de ponto flutuante
 * @author Laisy e Lucas
 * @version 1.0
 */
public class NumMim {

    double n1, n2, n3;

/** Construtor da classe
         * @param n1 o primeiro numero
         * @param n2 o segundo numero
         * @param n3 o terceiro numero
*/

    NumMim(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    double identificarMenor(){
        double menor;

        menor = Math.min(n1,n2);
        menor = Math.min(menor,n3);

        return menor;
    }

}
