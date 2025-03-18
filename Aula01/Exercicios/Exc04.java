import java.util.Scanner;

public class Exc04{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int age = 0;
        System.out.print("Qual a idade?");
        age = leia.nextInt();

        if (age >= 18){
            System.out.println("Voto obrigatório");
            }
        else{
            if (age >= 16 && age < 18) {
                System.out.println("Voto facultativo");
            }
            else{
                if (age < 16){
                    System.out.println("Voce não pode votar");    
                }

            }
        }


       

       

        leia.close();
    }
}
