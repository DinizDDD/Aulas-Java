package Aula03.testescomPOO;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);
    
        // Criando um objeto do tipo Carro
        Carro carro1 = new Carro("Azul", "Gol", 2020);

        System.out.println(carro1.cor);
        




       
        leia.close();
    }
}



