package For;
import java.util.Scanner;

public class tabuada{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        for (int i = 0; i <= 10; i++){
            int product = n * i;
            System.out.println(n+ " * " +i+ " = " +product);
    
        }

       
        leia.close();
    }
}

