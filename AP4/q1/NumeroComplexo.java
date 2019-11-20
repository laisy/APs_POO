public class NumeroComplexo {

    double a, b;
    String numComplx;
    String i;

    NumeroComplexo(double a, double b){
        this.a = a;
        this.b = b;
        this.i = i;
    }

    void imprimirNumComplx(){
        numComplx = "" + a + " + " + b + "i";
        System.out.println("O numero complexo: " + numComplx);
    }

    NumeroComplexo multiplicacao(NumeroComplexo n1){
        double ac, bd, a, ad, bc, b;

        ac = this.a * n1.a;
        bd = this.b * n1.b;
        a = ac - bd;

        ad = this.a * n1.b;
        bc = this.b * n1.a;
        b = ad + bc;

        NumeroComplexo n2 = new NumeroComplexo(a, b);
        return n2;
    }

}
