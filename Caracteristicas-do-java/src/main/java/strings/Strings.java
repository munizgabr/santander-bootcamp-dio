package strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    var string = new String(" Minha  String ");

    System.out.println("Char na posição : " + string.charAt(5));
    System.out.println("Quantidade=" + string.length());
    System.out.println("Sem Trim [" + string + "]");
    System.out.println("Com Trim [" + string.trim() + "]");
    System.out.println("Lower " + string.toLowerCase());
    System.out.println("Upper " + string.toUpperCase());
    System.out.println("Contém M? " + string.contains("M"));
    System.out.println("Contém X? " + string.contains("X"));
    System.out.println("Replace " + string.replace("n", "$"));
    System.out.println("Equals? " + string.equals(" Minha String "));
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
    System.out.println("Substring(1,6)=" + string.substring(1, 6));
    System.out.println("A B C D E F G".toCharArray());
    System.out.println("aula de java".split(""));
    System.out.println("Aula".concat(" de java")); // concatena "aula" com o parâmetro passado dentro do método split()"
    System.out.println("1234 asda qw".replaceAll("[0-9]","#")); // substitui todos os números no range de 0 a 9 por "#"
  }
}
