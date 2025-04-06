//Escreva um programa que leia um número e imprima se ele é par ou ímpar.
import java.util.Scanner;
public class ex13{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é par.");
        } else {
            System.out.println("O número " + n1 + " é ímpar.");
        }
        
        leia.close();
    }
}