//Escreva um programa que leia um número e imprima a metade desse número.
import java.util.Scanner;
public class ex9{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int metade = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        metade = n1 / 2;
        
        System.out.println("A metade de " + n1 + " é " + metade);
        
        leia.close();
    }
}