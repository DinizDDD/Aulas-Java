package While;
import java.util.Scanner;

public class paresV2{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual o número?");
        n = leia.nextInt();

        int i = 0;

        while (i <= n){
            if (i % 2 == 0){
                System.out.println(i);
            }

            i++;
        }

       
        leia.close();
    }
}
