package For;
import java.util.Scanner;

public class desafio{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0){
                System.out.println(i);
            }
        }

        leia.close();
    }
}

