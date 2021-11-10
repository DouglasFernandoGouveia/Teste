package forma ;

public class Circulo extends Forma{
    private double raio;
    private static final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getarea() {
        return PI * 2 * getRaio();
    }

    @Override
    public double getperimetro() {
        return PI * getRaio() * getRaio();
    }
}
