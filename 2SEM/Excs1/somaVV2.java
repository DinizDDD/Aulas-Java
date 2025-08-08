import java.util.Scanner;

public class VetorUnir {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Digite o valor do vetor1 posição " + i + ":");
            v1[i] = leia.nextInt();
            v3[i] = v1[i]; 
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Digite o valor do vetor2 posição " + i + ":");
            v2[i] = leia.nextInt();
            v3[i + 5] = v2[i];
        }

        System.out.println("Vetor unido:");
        for (int i = 0; i < v3.length; i++) {
            System.out.println("Posição " + i + ": " + v3[i]);
        }

        leia.close();
    }
}
