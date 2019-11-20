public class Lampada {
    boolean estadoDaLampada;
    int watts;

    Contador c = new Contador();

    Lampada(boolean estadoDaLampada, int watts){
        this.estadoDaLampada = estadoDaLampada;
        this.watts = watts;
    }

    boolean acende() {
        if (estadoDaLampada == false) {
            estadoDaLampada = true;
            c.incrementar();
        }
        return estadoDaLampada;
    }

    boolean apaga(){
        if (estadoDaLampada == true) {
            estadoDaLampada = false;
        }
        return estadoDaLampada;
    }
    void mostrarEstado() {
        if (estadoDaLampada == true) {
            System.out.println("A Lampada está acesa! ");
        } else{
            System.out.println("A Lampada está apagada! ");
        }
    }
    void economica(){
        if (this.watts > 40){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
    void ContadorLampada(){
        System.out.println("A lampada foi acesa " + c.consultar() + " vezes!");
    }

}
