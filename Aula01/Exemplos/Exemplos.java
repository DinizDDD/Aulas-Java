import java.util.Scanner;

public class Exemplos{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int num = 0; 
        System.out.println("informe um número inteiro");
        num = leia.nextInt();
        if (num > 0 && num < 10){
            System.out.println("O número está entre 1 e 9");
        }

        else{
            if (num <= 0 || num >= 10){
                System.out.println("O númet nao esta entre 1 e 9");
            }
            
        }
        leia.close();
    }
}