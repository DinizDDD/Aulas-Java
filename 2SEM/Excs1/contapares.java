import java.util.Scanner;

public class contapares {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers = new int[10];
        int contP = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();
            if (numbers[i] % 2 == 0) {
                contP++;
            }
        }

        System.out.println("Quantidade de números pares: " + contP);

        leia.close();
    }
}
