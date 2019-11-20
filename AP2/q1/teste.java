import java.util.Scanner;
public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o watts da Lampada: ");
        int watts = sc.nextInt();

        Lampada l = new Lampada(false, watts);
        l.economica();

        System.out.println("Digite o estado da lampada: [acesa/apagada] ");
        String estado = sc.next();

        if (estado.equals("acesa")){
            l.acende();
        } else{
            l.apaga();
        }

        l.mostrarEstado();
        l.ContadorLampada();
    }
}
