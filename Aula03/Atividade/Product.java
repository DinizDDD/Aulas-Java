package Aula03.Atividade;

public class Product {
    // Primeiro passo criei os atributos dessa classe
    String name;
    double price;

    // Depois, criei o construtor para a classe
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Apenas uma graça para ver o valor dos atributos
    void Info() {
        System.out.println("Nome: " + name);
        System.out.println("Preço: " + price);
    }

    public String getName() {
        return name;
    }

    
}
