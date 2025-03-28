//Desenvolva um algoritmo que receba dois números e determine qual é o maior.
import java.util.Scanner;
public class ex2{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n2 = 0;
        int n1 = 0;

        System.out.print("Por favor, informe o primeiro número: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe o segundo número: ");
        n2 = leia.nextInt();
        
        if (n1 > n2){
            System.out.println("O "+n1+" é maior que o número "+n2+".");
        }
        else if (n1 == n2){
            System.out.println("O "+n1+" é igual o número "+n2+".");
        }
        else{
            System.out.println("O "+n1+" é menor que o número "+n2+".");
        }
        leia.close();
    }
}

//O resultado sera assim:
/*Por favor, informe o primeiro número: 2
Por favor, informe o segundo número: 4
O 2 é menor que o número 4.*/
