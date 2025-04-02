//Escreva um programa que leia um número e imprima a diferença desses números.
import java.util.Scanner;
public class ex5{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int diferenca = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();
        
        diferenca = n1 - n2;


        System.out.println("A diferença dos números que voce escolheu é: "+diferenca+".");
        leia.close();
    }
}

