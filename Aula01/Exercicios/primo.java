import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do número
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        // Verificar se o número é primo
        boolean ehPrimo = true;
        
        if (numero <= 1) {
            ehPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        
        // Exibir o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
}
