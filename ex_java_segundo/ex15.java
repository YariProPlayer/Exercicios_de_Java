//Escreva um programa que leia dois números e imprima se a soma deles é maior que 100.
import java.util.Scanner;
public class ex15{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int soma = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();

        soma = n1 + n2;

        if (soma > 100) {
            System.out.println("A soma é " + soma + ", que é maior que 100.");
        } else {
            System.out.println("A soma é " + soma + ", que não é maior que 100.");
        }
        
        leia.close();
    }
}