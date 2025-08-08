import java.util.Scanner;

    public class tripledouble{
        public static void main(String args[]){
            Scanner leia = new Scanner (System.in);

            int n1 = 0;
            System.out.println("Informe o primeiro número:");
            n1 = leia.nextInt();

            int n2 = 0;
            System.out.println("Informe o segundo número:");
            n2 = leia.nextInt();

            if (n1 > n2){
                System.out.println(n1 + " é o maior número");
            } else {
                System.out.println(n2 + " é o maior número");
            }
    
            leia.close();
        }
    }



