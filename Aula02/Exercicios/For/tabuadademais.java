package For;
import java.util.Scanner;

public class tabuadademais{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        for (int i = 0; i <= n; i++){
            int product = n + i;
            System.out.println(n+ " + " +i+ " = " +product);
    
        }

       
        leia.close();
    }
}


