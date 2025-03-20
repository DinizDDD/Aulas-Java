import java.util.Scanner;

public class bissexto{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int year = 0;
        System.out.println("Qual ano voce quer verificar?");
        year = leia.nextInt();

        boolean verification = false;

        // verificação para saber se o ano é bissexto
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            verification = true;
        }

        // verificação para saber qual texto deve aparecer no terminal
        if (verification == true){
            System.out.println("Esse ano é bissexto");
        }
        else{
            System.out.println("Esse ano não é bissexto");
        }

        leia.close();
    }
}