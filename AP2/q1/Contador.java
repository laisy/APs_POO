public class Contador {

    int valor;

    Contador(){
        this.valor = 0;
    }
    Contador(int valor){
        this.valor = valor;
    }

    int zerar(){
        valor = 0;
        return valor;
    }
    int incrementar(){
        valor += 1;
        return valor;
    }
    int consultar(){
        valor = valor;
        return valor;
    }
}
