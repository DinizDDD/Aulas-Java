import java.util.Scanner;

public class Exc03{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual a primeira nota desse aluno?");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Qual a segunda nota desse aluno?");
        n2 = leia.nextInt();

        int n3 = 0;
        System.out.println("Qual a terceira nota desse aluno?");
        n3 = leia.nextInt();

        float media = 0;
        media = (n1+n2+n3) / 3;

        
        if (media >= 7){
            System.out.println("Aluno aprovado!");
        }

        else {
            System.out.println("Aluno reprovado!");
        }

       

        leia.close();
    }
}
