import java.util.Scanner;

public class area{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int altura = 0; 
        System.out.println("informe o valor da altura:");
        altura = leia.nextInt();

        int base = 0;
        System.out.println("Informe o valor da base:");
        base = leia.nextInt();

        int area = base * altura;

        System.out.println("A aréa é igual  a "+ area);

        leia.close();
    }
}

