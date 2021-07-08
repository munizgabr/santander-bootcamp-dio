package one.innovation.digital.exercicios.funcionario;

public class Supervisor extends Funcionario {

    public double CalcDesconto() {
        return this.getSalario() * 0.013;
    }

    @Override
    public double SalarioFinal() {
        return this.getSalario() - this.CalcDesconto();
    }
}
