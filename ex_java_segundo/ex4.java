//Escreva um programa que leia um número e imprima o cubo desse número.
import java.util.Scanner;
public class ex4{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int cubo = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        cubo = n1 * n1 * n1;


        System.out.println("O cubo do número que voce escolheu é: "+cubo+".");
        leia.close();
    }
}
