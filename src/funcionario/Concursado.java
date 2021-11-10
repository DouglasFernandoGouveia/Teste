package funcionario;

public class Concursado extends Funcionario {
    private int anosTrablho;

    public Concursado(double salarioBase, int anosTrablho) {
        super(salarioBase);
        this.anosTrablho = anosTrablho;
    }

    @Override
    protected double getGratificacao() {
        return 0.2 * (anosTrablho / 5 ) * salarioBase;
    }
}

