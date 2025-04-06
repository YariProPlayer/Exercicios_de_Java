//Escreva um programa que leia um número e imprima o valor absoluto desse número.
import java.util.Scanner;
public class ex10{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int absoluto = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        
        if (n1 < 0) {
            absoluto = -n1;
        } else {
            absoluto = n1;
        }
        
        System.out.println("O valor absoluto de " + n1 + " é " + absoluto);
        
        leia.close();
    }
}