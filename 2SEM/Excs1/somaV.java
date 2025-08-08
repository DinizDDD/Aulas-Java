import java.util.Scanner;

public class somaV {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers = new int[8];
        int soma = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();
            soma += numbers[i];
        }

        System.out.println("A soma dos elementos é: " + soma);

        leia.close();
    }
}
