import java.util.Scanner;

public class frentetras{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0; 
        System.out.println("informe um número:");
        n1 = leia.nextInt();


        int sucessor  = n1 + 1;
        int antecessor = n1 - 1;

        System.out.println("\n");


        System.out.println(sucessor);
        System.out.println(n1);
        System.out.println(antecessor);

        leia.close();
    }
}

