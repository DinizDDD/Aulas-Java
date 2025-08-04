package Aula03.testescomPOO;

public class Carro {

    String cor;
    String modelo;
    int ano;

    void ligar() {
        System.out.println("Carro ligado!");
    }

    void acelerar() {
        System.out.println("Acelerando...");
    }

    public Carro(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    
}
