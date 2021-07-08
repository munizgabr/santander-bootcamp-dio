package ifs;

public class IF {

  public static void main(String[] args) {

    final var condicao = true;

    if (condicao) {
      System.out.println("A condição é verdadeira");
    } else {
      System.out.println("A condição é falsa");
    }

    if (condicao)
      System.out.println("Uma única linha..."); // quando o código tem uma única linha não necessita das chaves no if{}

    final var ternario = condicao ? "é verdadeira" : "é falsa";

    System.out.println(ternario);
  }
}
