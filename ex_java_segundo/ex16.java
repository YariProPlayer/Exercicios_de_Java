// Escreva um programa que leia um número e imprima todos os números de 1 até esse número, mas apenas os que são múltiplos de 2 ou 3.
import java.util.Scanner;
public class ex16{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();

        System.out.println("Números de 1 até " + n1 + " que são múltiplos de 2 ou 3:");

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
        
        leia.close();
    }
}