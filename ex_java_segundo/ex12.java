//Escreva um programa que leia dois números e imprima o maior deles.
import java.util.Scanner;
public class ex12{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();
        
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
        
        leia.close();
    }
}