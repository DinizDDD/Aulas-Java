import java.util.Scanner;

public class soma{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0; 
        System.out.println("informe o primeiro número");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Informe o segundo número");
        n2 = leia.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma desses números é "+ soma);

        leia.close();
    }
}

