package Aula02.Exercicios;

import java.util.Scanner;

public class contador{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i); 
        }

        leia.close();
    }
}

