package one.innovation.digital.exercicios.funcionario;

public class Gerente extends Funcionario{

    @Override
    public double CalcDesconto() {
        return this.getSalario()*0.015;
    }
    public double SalarioFinal() {
        return this.getSalario() - this.CalcDesconto();
    }
}
