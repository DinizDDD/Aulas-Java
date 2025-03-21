import java.util.Scanner;

public class salario{
    public static void main(String args[]){
        Scanner leia = new Scanner (System.in);

        double salario = 0;
        System.out.println("Qual o valor do salário/n/n")
        salario = leia.nextDouble();

        double pagamento = 0;

        if (salario <= 2.259,20){
            System.out.println("Seu salario não recebe imposto")
        } else{
            if (salario <= 2.826,65){
                System.out.println("Seu salario recebe 	7,5% de impostos")
                pagamento = salario * 0,075;
            } else {
                if (salario <= 3.751,05){
                    System.out.println("Seu salario recebe 15% de impostos")
                    pagamento = salario * 0,15;
                } else {
                    if (salario <= 4.664,68){
                        System.out.println("Seu salario recebe 22,5% de impostos")  
                        pagamento = salario * 0,225;
                    } else {
                        if (salario > 4.664,68){
                            System.out.println("Seu salario recebe 27,5% de impostos")
                            pagamento = salario * 0,275;
                        }                      
                    }
                }
            }
        }

    System.out.println("/n/nSeu salario final é "+pagamento)
        
    leia.close();
    } 
}
