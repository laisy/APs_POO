package back;

public class Racional {
    private int num, den;

    public Racional(int num, int den) {
        if (den == 0){
            System.out.println("Não existe DENOMINADOR igual 0! Utilizaremos em seu lugar, 1!");
            this.den = 1;
        } else if (num > den) {
            for (int i = 1; i < num; i++) {
                if ((num % i == 0) && (den % i == 0)) {
                    this.num = num/i;
                    this.den = den/i;
                }
            }
        } else if (num < den) {
            for (int i = 1; i < den; i++) {
                if ((num % i == 0) && (den % i == 0)) {
                    this.num = num/i;
                    this.den = den/i;
                }
            }
        }
    }

    public void oRedutorDeFracao(int num, int den) {
        if (den == 0){
            System.out.println("Não existe DENOMINADOR igual 0! Utilizaremos em seu lugar, 1!");
            this.den = 1;
        } else if (num > den) {
            for (int i = 1; i < num; i++) {
                if ((num % i == 0) && (den % i == 0)) {
                    this.num = num/i;
                    this.den = den/i;
                }
            }
        } else if (num < den) {
            for (int i = 1; i < den; i++) {
                if ((num % i == 0) && (den % i == 0)) {
                    this.num = num/i;
                    this.den = den/i;
                }
            }
        }
    }

    public void setFracao (int num, int den) {
        oRedutorDeFracao(num, den);
    }

    public int getNumerador (int num) {
        return this.num;
    }
    public int getDenominador (int den) {
        return this.den;
    }

    public void exibirFracao () {
        System.out.println(""+this.num+"/"+this.den);
    }
    public void exibirDecimal () {
        System.out.println(this.num/this.den);
    }

    public Racional somarFracao (Racional fracao2) {
        if (this.den == fracao2.den) {
            int numerador = this.num += fracao2.num;

            return new Racional(numerador, this.den);
        } else {
            int mmc, numeradorFracao1, numeradorFracao2, numeradorResultante;
            mmc = this.den * fracao2.den;
            numeradorFracao1 = (mmc/this.den) * this.num;
            numeradorFracao2 = (mmc/fracao2.den) * fracao2.num;
            numeradorResultante = numeradorFracao1 + numeradorFracao2;

            return new Racional(numeradorResultante, mmc);
        }
    }
    public Racional multiFracao (Racional fracao2) {
        int numerador, denominador;

        numerador = this.num * fracao2.num;
        denominador = this.den * fracao2.den;

        return new Racional(numerador, denominador);
    }
}