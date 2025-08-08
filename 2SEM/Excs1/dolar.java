import java.util.Scanner;

public class dolar{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        double real = 0; 
        System.out.println("informe o valor em reais:");
        real = leia.nextDouble();

        double cotdolar = 0;
        System.out.println("Informe a cotação do dolar:");
        cotdolar = leia.nextDouble();

        double dolar = real * cotdolar;

        System.out.println("O valor em dólar fica: "+ dolar);

        leia.close();
    }
}

