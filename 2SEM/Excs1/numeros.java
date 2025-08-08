import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            numbers[i] = leia.nextInt();
        }

        leia.close();
    }
}