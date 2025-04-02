//Escreva um programa que leia um número e imprima o produto desses números.
import java.util.Scanner;
public class ex6{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int produto = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();
        
        produto = n1 * n2;


        System.out.println("O produto dos números que voce escolheu é: "+produto+".");
        leia.close();
    }
}