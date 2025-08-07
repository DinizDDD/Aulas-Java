import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String passworld = "6924";
        String pass = "";

        do {
            System.out.print("Digite a senha: ");
            passworld = leia.nextLine();

            if (pass != passworld) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!pass.equals(passworld));

        System.out.println("Acesso permitido!");
        leia.close();
    }
}
