package Simples;
import java.util.Scanner;

public class produto{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual o valor do primeiro número?");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Qual o valor do segundo número?");
        n2 = leia.nextInt();

        int product = n1 * n2;

        System.out.println("O produto desses números é "+product);



        leia.close();
    }
}

