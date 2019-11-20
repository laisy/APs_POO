public class Contador {

    public static void main(String[] args) {
        int x, y, soma = 0;

        for(int x=-100; x<100; x++) {
            for (int y = 100; y > -100; y++) {
                soma = x + y;
                if (soma == 100 || soma == -100) {
                    System.out.printf("X = %d e Y = %d \n", x, y);

                }
            }

        }

    }
}
