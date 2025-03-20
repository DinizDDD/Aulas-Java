import java.util.Scanner;

public class notaetec{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n = 0;
        System.out.println("Qual a nota?");
        n = leia.nextInt();

        String converted = "";

        if (n <= 4){
            converted = "I";
        }
        if (n <= 6 && n >= 5){
            converted = "R";
        }
        if (n <= 8 && n >= 7){
            converted = "B";
        }
        if (n <= 10 && n >= 9){
            converted = "MB";
        }

        System.out.println("A nota convertida ao sistema MB,B,R e I fica "+converted);
        

        



        leia.close();
    }

}