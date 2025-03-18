import java.util.Scanner;

public class Exc06{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        if (n % 2 == 0) {
            System.out.println("O númeoro "+n+" é par");
        }

        else{
            System.out.println("O número "+n+" é ímpar");
        }


        leia.close();
    }

}