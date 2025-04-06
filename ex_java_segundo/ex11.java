//Escreva um programa que leia um número e imprima se ele é positivo ou negativo.
import java.util.Scanner;
public class ex11{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
         if (n1 > 0) {
            System.out.println("O número é positivo.");
        } else if (n1< 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        
        
        leia.close();
    }
}