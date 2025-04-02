//Escreva um programa que leia dois números e imprima a soma deles.
import java.util.Scanner;
public class ex2{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int soma = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe outro numero: ");
        n2 = leia.nextInt();

        soma = n1 + n2;
        
        System.out.println("A soma dos números é: "+soma+".");
        leia.close();
    }
}

