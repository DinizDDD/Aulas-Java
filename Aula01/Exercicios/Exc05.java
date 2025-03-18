import java.util.Scanner;

public class Exc05{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        float celsius = 0;
        System.out.println("Qual o valor em Celsius?");
        celsius = leia.nextFloat();

        float farenheit = 0;
        farenheit = (celsius * 1.8f + 32);
        

        System.out.println("Em Farenheit fica "+farenheit+"F");

        leia.close();
    }

}