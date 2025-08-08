import java.util.Scanner;

public class invertida {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();
        }

        System.out.println("Valores na ordem inversa:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        leia.close();
    }
}
