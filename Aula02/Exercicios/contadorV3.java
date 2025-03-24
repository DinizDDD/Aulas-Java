package Aula02.Exercicios;

import java.util.Scanner;

public class contadorV3{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }  while ( i <= n);



        


        


        leia.close();
    }
}
