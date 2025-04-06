//Escreva um programa que leia três números e imprima o maior deles.
import java.util.Scanner;
public class ex14{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int maior = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n3 = leia.nextInt();
        
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);
        
        leia.close();
    }
}