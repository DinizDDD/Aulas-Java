package Condicionais;
import java.util.Scanner;

public class positivo{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual o número? obs: zero é nulo");
        n1 = leia.nextInt();

        if (n1 > 0){
        System.out.println("Esse número é positivo");

        } else {
            System.out.println("Esse número é negativo");
        }
        


        


        leia.close();
    }
}
