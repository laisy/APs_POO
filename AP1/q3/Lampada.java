public class Lampada {
    boolean estadoDaLampada;
    int watts;

    Lampada(boolean estadoDaLampada, int watts){
        this.estadoDaLampada = estadoDaLampada;
        this.watts = watts;
    }

    boolean acende(){
        estadoDaLampada = this.estadoDaLampada;
        return estadoDaLampada;
    }

    boolean apaga(){
        estadoDaLampada = this.estadoDaLampada;
        return estadoDaLampada;

    }
    void mostrarEstado() {
        if (acende() == true || apaga() == true) {
            System.out.println("A Lampada está acesa! ");
        } else {
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

}
