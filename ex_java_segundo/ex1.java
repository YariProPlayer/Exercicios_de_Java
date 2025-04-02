//Escreva um programa que leia um número e imprima "Olá, Mundo!".
import java.util.Scanner;
public class ex1{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        System.out.println("Olá, Mundo");
        System.out.println("O número que voce escolheu é: "+n1+".");
        leia.close();
    }
}
