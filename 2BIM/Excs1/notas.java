import java.util.Scanner;

    public class tripledouble{
        public static void main(String args[]){
            Scanner leia = new Scanner (System.in);

            int n1 = 0;
            System.out.println("Informe a primeiro nota:");
            n1 = leia.nextInt();

            int n2 = 0;
            System.out.println("Informe a segunda nota:");
            n2 = leia.nextInt();

            media = (n1 + n2) / 2;

            if (media >= 7){
                System.out.println("Vc foi aprovado");
            } else{
                if (media >= 5 && media < 7);
                    System.out.println("Vc está de recuperção");
            } else {
                if (media < 5){
                    System.out.println("Vc foi reprovado");
                }
            }
            




    
            leia.close();
        }
    }




