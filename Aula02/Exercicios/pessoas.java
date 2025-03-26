
import java.util.Scanner;

public class pessoas{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        // 2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
        
        // a. a maior e a menor altura do grupo;
        // b. média de altura dos homens;
        // c. o número de mulheres.

        int sex = 0; double height = 0; double bigger = 0; double minor = 0; double sumH = 0; double mediaH = 0; int womans = 0; int mans = 0;

        for (int i = 0; i <= 10; i++){
            
            System.out.println("Qual o gênero da pessoa?");
            System.out.println("1 = Homem || 2 = Mulher");
            sex = leia.nextInt();

            System.out.println("Qual a altura?");
            height = leia.nextDouble();

            if (sex == 1){
                mans = mans + 1;
                sumH = sumH + height;
            } else { if (sex == 2){
                        womans = womans + 1;
                } else {
                    System.out.println("Opção Invalida!");
                }
            }

            if (bigger < height){
                bigger = height;
            } 
            if (minor > height){
                minor = height;
            }

        }

        mediaH = sumH / mans;

        System.out.println("A maior altura é "+bigger+ " e a menor "+minor);
        System.out.println("A média da altura dos homens é "+mediaH);
        System.out.println("A quantidade de mulheres é "+womans);


       
        leia.close();
    }
}