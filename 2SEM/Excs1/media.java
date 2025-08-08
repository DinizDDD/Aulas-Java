import java.util.Scanner;

public class media{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0; 
        System.out.println("informe a primeira nota");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Informe a segunda nota");
        n2 = leia.nextInt();

        int n3 = 0;
        System.out.println("Informe a terceira nota");
        n3 = leia.nextInt();

        double soma = n1 + n2 + n3; 

        double media = soma / 3;

        System.out.println("A média é "+ media);

        leia.close();
    }
}

