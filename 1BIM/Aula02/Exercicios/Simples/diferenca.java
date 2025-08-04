package Simples;
import java.util.Scanner;

public class diferenca{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual o primeiro número?");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Qual o segundo número?");
        n2 = leia.nextInt();

        if (n2 > n1){
            int lib = n2;
            n2 = n1;
            n1 = lib;
        }

        int diferenca = n1 - n2;

        System.out.println("A distância entre esses números é "+diferenca);




       
        leia.close();
    }
}

