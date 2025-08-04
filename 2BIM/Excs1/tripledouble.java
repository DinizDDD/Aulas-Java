    import java.util.Scanner;

    public class tripledouble{
        public static void main(String args[]){
            Scanner leia = new Scanner (System.in);

            int n1 = 0; 
            System.out.println("informe um número:");
            n1 = leia.nextInt();

            int dobro = n1 * 2;

            int triplo = n1 * 3;

            System.out.println("\n");

            System.out.println("Base "+ n1);
            System.out.println("Dobro "+ dobro);
            System.out.println("Triplo "+ triplo);

            leia.close();
        }
    }

