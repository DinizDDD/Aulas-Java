package Condicionais;
import java.util.Scanner;

public class cubico{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        if (n % 3 == 0){
            System.out.println("Esse número é multiplo de 3");
        } else {
            System.out.println("Esse número não é multiplo de 3");
        }


        
        
        leia.close();
    }
}
