import java.util.Scanner;

public class SistemaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do valor total de compras
        System.out.print("Digite o valor total das compras: R$ ");
        double totalCompra = scanner.nextDouble();
        
        // Definir o desconto
        double desconto = 0;
        if (totalCompra >= 500) {
            desconto = 0.2; // 20% de desconto para compras acima de R$ 500
        } else if (totalCompra >= 200) {
            desconto = 0.1; // 10% de desconto para compras entre R$ 200 e R$ 499
        }
        
        // Calcular o valor final com o desconto
        double valorDesconto = totalCompra * desconto;
        double valorFinal = totalCompra - valorDesconto;
        
        // Exibir o resultado
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final após o desconto: R$ " + valorFinal);
        
        scanner.close();
    }
}
