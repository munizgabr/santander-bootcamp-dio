package one.innovation.digital.exercicios;

public class Carro {
    public Carro(String marca, String modelo, Integer ano){
    }
    private String marca;
    public String getMarca(){

        return marca;
    }
    public void setMarca(){

        this.marca = marca;
    }
    private String modelo;
    public String getModelo(){

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }
    private Integer ano;

    public Integer getAno() {

        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
