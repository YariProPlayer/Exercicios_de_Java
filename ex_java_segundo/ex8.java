//Escreva um programa que leia um número e imprima o dobro desse número.
import java.util.Scanner;
public class ex8{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int dobro = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        dobro = n1 * 2;
        
        System.out.println("O dobro de " + n1 + " é " + dobro);
        
        leia.close();
    }
}