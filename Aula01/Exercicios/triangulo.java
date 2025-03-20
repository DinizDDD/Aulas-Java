import java.util.Scanner;

public class triangulo{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);
        
        int l1 = 0;
        System.out.println("Qual o tamanho do primeiro lado");
        l1 = leia.nextInt();

        int l2 = 0;
        System.out.println("Qual o tamanho do segundo lado");
        l2 = leia.nextInt();

        int l3 = 0;
        System.out.println("Qual o tamanho do terceiro lado");
        l3 = leia.nextInt();

        if (l1 > l2 || l1 > l3 || l2 > l1 || l2 > l3 || l3 > l1 || l3 > l2)
            if (l2 == l1 || l2 == l3) {
                System.out.println("Esse triângulo é isósceles");  
            }
            else{
                System.out.println("Esse triângulo é escaleno"); 
            }
        
        else {
            System.out.println("Esse triângulo é equilátero"); 
        }

        leia.close();
    }
}
