import java.util.Scanner;

    public class tripledouble{
        public static void main(String args[]){
            Scanner leia = new Scanner (System.in);

            int i = 0;
            System.out.println("Informe o número:");
            i = leia.nextInt();

            if (i >= 18){
                System.out.println("Voce é maior de idade");
            } else {
                System.out.println("Voce é menor de idade");
            }
    
            leia.close();
        }
    }


