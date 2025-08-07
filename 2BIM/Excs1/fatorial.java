import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = leia.nextInt();

        long fat = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}

