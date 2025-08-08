import java.util.Scanner;

public class exiba {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers    = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();
        }

        System.out.println("Valores armazenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numbers[i]);
        }

        leia.close();
    }
}
