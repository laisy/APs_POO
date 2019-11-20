package back;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo() {
        this.altura = 1;
        this.largura = 1;
    }

    public double area (double altura, double largura) {
        double area;

        area = altura * largura;
        return area;
    }

    public double perimetro (double altura, double largura) {
        double perimetro;

        perimetro = (2*altura) + (2*largura);
        return perimetro;
    }

    public boolean setAltura (double altura) {
        if (altura > 0 && altura < 20) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public boolean setLargura (double largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public double getAltura () {
        return this.altura;
    }

    public double getLargura () {
        return this.largura;
    }
}