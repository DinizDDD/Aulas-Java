import java.util.Scanner;

public class maiormenorV2{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        int n1 = 0;
        System.out.println("Qual o valor do primeiro número");
        n1 = leia.nextInt();

        int n2 = 0;
        System.out.println("Qual o valor do segundo número");
        n2 = leia.nextInt();

        int n3 = 0;
        System.out.println("Qual o valor do terceiro número");
        n3 = leia.nextInt();

        int first = 0;
        int second = 0;
        int third = 0;
        
        // verificação para saber qual é maior
        // concerteza deve ter um jeito melhor de fazer isso

        //primeito verifico se o n1 é o maior de todos
        if (n1 > n2 && n1 > n3){
            first = n1;

            // essa logica segue para todos os casos
            if (n2 > n3){
                second = n2;
                third = n3;
            }
            else{
                second = n3;
                third = n2;
            }
        }
        // caso o n1 não for verico o n2
        else {
            if (n2 > n1 && n2 > n3){
                first = n2;

                if (n1 > n3){
                    second = n1;
                    third = n3;
                }
                else{
                    second = n3;
                    third = n1;
                }
            }
            // entao aqui o maior é o n3
            else{
                first = n3;
                 
                if (n1 > n2){
                    second = n1;
                    third = n2;
                }
                else{
                    second = n2;
                    third = n1; 
                }       
            }
        }

        System.out.println("Do maior para o menor fica " +first+ " " +second+ " " +third);


        leia.close();
    }
}

