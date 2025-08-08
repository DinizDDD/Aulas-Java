import java.util.Scanner;

public class nomes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Digite o nome da posição " + i + ":");
            names[i] = leia.nextLine();
        }

        System.out.println("Digite um nome para buscar:");
        String search = leia.nextLine();

        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }

        leia.close();
    }
}
