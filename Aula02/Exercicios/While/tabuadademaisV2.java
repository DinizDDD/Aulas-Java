package While;
import java.util.Scanner;

public class tabuadademaisV2{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int i = 0;

        while (i <= n){
            int product = n + i;
            System.out.println(n+ " + " +i+ " = " +product);

            i++;
    
        }

       
        leia.close();
    }
}

