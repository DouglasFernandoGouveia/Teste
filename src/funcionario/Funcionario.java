package funcionario;

abstract class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salarioBase + getGratificacao();
    }
    protected double getGratificacao(){
        return 0;
    }
}

