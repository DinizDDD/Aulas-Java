import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        // Calcular o fatorial
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        // Exibir o resultado
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
        scanner.close();
    }
}
