package one.innovation.digital.exercicios.funcionario;

public class Funcionario {
    private double salario;
    private double desconto;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double CalcDesconto(){
        return this.salario * 0.01;
    }
    public double SalarioFinal() {
    return this.salario - this.desconto;
    }
}
