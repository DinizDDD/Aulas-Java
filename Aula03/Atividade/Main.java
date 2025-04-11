package Aula03.Atividade;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        Product produto1 = new Product("Almondega", 10.00);

        System.out.println(produto1.getName()); 




        leia.close();
    }
    
}
