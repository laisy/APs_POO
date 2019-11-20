public class Lampada {
    boolean estadoDaLampada;

    boolean acende(){
        estadoDaLampada = true;
        return estadoDaLampada;
    }

    boolean apaga(){
        estadoDaLampada = false;
        return estadoDaLampada;

    }
    void mostrarEstado(){
        if(acende() == true || apaga() == true) {
            System.out.println("A Lampada está acesa! ");
        } else {
            System.out.println("A Lampada está apagada! ");
        }

    }

}
