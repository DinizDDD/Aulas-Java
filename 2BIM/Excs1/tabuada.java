import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int n = leia.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        leia.close();
    }
}
