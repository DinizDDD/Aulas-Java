package Aula02.Exercicios;

import java.util.Scanner;

public class pairornot{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        if (n % 2 == 0){
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }

        // TESTAR ESSE
        
        
        leia.close();
    }
}

