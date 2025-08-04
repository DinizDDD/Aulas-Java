import java.util.Scanner;

public class name{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        String name = ""; 
        System.out.println("informe Seu nome:");
        name = leia.nextLine();

        String sobrenome = "";
        System.out.println("Agora seu sobrenome");
        sobrenome = leia.nextLine();

        System.out.println("Seu nome completo é " + name + " " + sobrenome);

        leia.close();
    }
}

