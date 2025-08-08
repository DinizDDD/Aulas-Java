import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] ns = new double[5];
        double soma = 0;

        for (int i = 0; i < ns.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            ns[i] = leia.nextDouble();
            soma += ns[i];
        }

        double media = soma / ns.length;
        System.out.printf("A média das notas é: %.2f\n", media);

        leia.close();
    }
}
