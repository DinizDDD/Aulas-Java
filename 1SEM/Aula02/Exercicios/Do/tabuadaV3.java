package Do;
import java.util.Scanner;

public class tabuadaV3{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int i = 0;

        do {
            int product = n * i;
            System.out.println(n+ " * " +i+ " = " +product);

            i++;
        } while ( i <= 10);

       
        leia.close();
    }
}


