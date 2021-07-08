package one.innovation.digital.exercicios.funcionario;


public class Pagamento {
    public static void main(String[] args) {

        Gerente gabriel = new Gerente();
        gabriel.setSalario(5500.99);
        System.out.println("O salário do gerente Gabriel é:" + gabriel.SalarioFinal());


        Atendente luiz = new Atendente();
        luiz.setSalario(2500);
        System.out.println("O salário do atendente Luiz é:" + luiz.SalarioFinal());

        Supervisor bruno = new Supervisor();
        bruno.setSalario(4980.55);
        System.out.println("O salário do supervisor Bruno é:" + bruno.SalarioFinal());

    }
}
