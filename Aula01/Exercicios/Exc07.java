import java.util.Scanner;

public class Exc07{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        double altura = 0;
        System.out.println("Qual sua altura?");
        altura = leia.nextDouble();

        double peso = 0;
        System.out.println("Qual seu peso?");
        peso = leia.nextDouble(); 

        double IMC = peso / (altura * altura);

        if (IMC < 18.5f){
            System.out.println("Voce está na magreza");
        }    
        else{
            if (IMC >= 18.5f && IMC <= 24.9f){
                System.out.println("Voce está saúdavel");
            }
            else{
                if (IMC >= 25.0f && IMC <= 29.9f){
                    System.out.println("Voce está com sobrepeso");
                }
                else{
                    if (IMC >= 30.0f && IMC <= 34.9f){
                        System.out.println("Voce está obeso");
                    }
                    else{
                        if (IMC >= 35.0f && IMC <= 34.9f){
                            System.out.println("Voce está com obesidade grau 1");
                        }
                        else{
                            if (IMC >= 35.0f && IMC <= 39.9f){
                                System.out.println("Voce está severamnente obeso");
                            }
                            else{
                                if (IMC >= 40.0f){
                                    System.out.println("Voce está com obesidade mórbida");
                                }
                            }
                        }
                    }
                } 
            } 
        }



        leia.close();
    }

}