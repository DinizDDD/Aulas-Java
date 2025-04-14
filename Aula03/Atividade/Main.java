package Aula03.Atividade;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        Product produto1 = new Product("Almondega", 10.00);

        // o atributo nome, é public, então ele funciona das duas formas
        System.out.println(produto1.name);
        System.out.println(produto1.getNome());

        // agora o preço, é private, então ele só printa utilizando o getPrice()
        // System.out.println(produto1.price);
        System.out.println(produto1.getPrice());



        // Assim como no exemplo anterior, o nome é alterado das duas formas por ser public
        produto1.setNome("Davi");
        produto1.name = "Eduardo";

        // agora o preço que é private, só funciona com o set
        produto1.setPrice(25);
        // produto1.price = 30;

        
        
        // Porém, se eu fizer um metódo para printar o preço, ele irá aparecer do mesmo jeito
        produto1.Info();

        // Isso também funciona para alterar o valor do atributo
        produto1.Mudar();
        System.out.println(produto1.getPrice());


        leia.close();
    }
    
}
