import java.util.Scanner;

    public class tripledouble{
        public static void main(String args[]){
            Scanner leia = new Scanner (System.in);

            int n1 = 0;
            System.out.println("Informe o número:");
            n1 = leia.nextInt();

            if (n1 % 2 == 0){
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é impar");
            }
    
            leia.close();
        }
    }

