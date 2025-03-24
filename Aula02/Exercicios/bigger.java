package Aula02.Exercicios;

import java.util.Scanner;

public class bigger{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual o primeiro número?");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Qual o segundo número?");
        n2 = leia.nextInt();

        if (n1 > n2){
            System.out.println(n1+ " é maior que "+n2);
        } else {
            System.out.println(n2+ " é maior que "+n1);
        
        }


        leia.close();
    }
}

