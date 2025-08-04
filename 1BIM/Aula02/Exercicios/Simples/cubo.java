package Simples;
import java.util.Scanner;

public class cubo{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int cubic = n * n *n;

        System.out.println("O cubo desse número é "+cubic);


       
        leia.close();
    }
}

