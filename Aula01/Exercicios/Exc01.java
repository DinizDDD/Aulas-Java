import java.util.Scanner;

public class Exemplo001{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        String name = "";
        System.out.print("Qual seu nome?");
        name = leia.nextLine();

        int age = 0;
        System.out.println("Qual sua idade?");
        age = leia.nextInt(); 

        System.out.print("Seu nome é "+ name + " E sua idade "+ age);



        leia.close();
    }
}