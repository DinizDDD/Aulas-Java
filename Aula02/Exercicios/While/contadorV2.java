package While;
import java.util.Scanner;

public class contadorV2{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int i = 1;

        while (i <= n){
            System.out.println(i);
            i++;
        }




        


        


        leia.close();
    }
}
