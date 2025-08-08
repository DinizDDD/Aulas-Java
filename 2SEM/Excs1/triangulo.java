import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int l1 = leia.nextInt();

        System.out.print("Digite o segundo lado: ");
        int l2 = leia.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int l3 = leia.nextInt();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            System.out.println("Os valores formam um triângulo!");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        leia.close();
    }
}
