import java.util.Scanner;

public class VetorMaiorValor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers = new int[10];
        int bigger = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();

            if (numbers[i] > bigger) {
                bigger = numbers[i];
            }
        }

        System.out.println("O maior valor é: " + bigger);

        leia.close();
    }
}
