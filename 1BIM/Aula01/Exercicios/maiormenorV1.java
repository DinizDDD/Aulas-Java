import java.util.Scanner;

public class maiormenorV1{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Informe seu primeiro número");
        n1 = leia.nextInt(); 

        int n2 = 0;
        System.out.println("Informe seu segundo número");
        n2 = leia.nextInt();

        if (n1 > n2){
            System.out.println(n1+ " É maior que "+n2);
        }

        else{
            System.out.println(n2+ " É maior que "+n1);
        }

        leia.close();
    }
}
