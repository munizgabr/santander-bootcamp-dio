package one.innovation.digital.exercicios.funcionario;

public class Atendente extends Funcionario {


    public double CalcDesconto() {
        return this.getSalario() * 0.010;

    }
    public double SalarioFinal() {
        return this.getSalario() - this.CalcDesconto();
    }
}
