package Simples;
import java.util.Scanner;

public class quadrado{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int square = n * n;

        System.out.println("O quadrado desse número é "+square);
       
        leia.close();
    }
}

