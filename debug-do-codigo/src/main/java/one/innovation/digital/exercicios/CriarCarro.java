package one.innovation.digital.exercicios;

public class CriarCarro {

    public static void main(String[] args){
        Carro carrinho = new Carro("Kia", "Ceratto",2012);
        System.out.println(carrinho.getMarca());
        System.out.println(carrinho.getModelo());
        System.out.println(carrinho.getAno());
    }
}
