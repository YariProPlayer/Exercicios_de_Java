//Escreva um programa que leia um número e imprima o quadrado desse número.
import java.util.Scanner;
public class ex3{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int quadrado = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        quadrado = n1 * n1;


        System.out.println("O quadrado do número que voce escolheu é: "+quadrado+".");
        leia.close();
    }
}
