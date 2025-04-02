//Escreva um programa que leia dois números e imprima o quociente da divisão do primeiro pelo segundo.
import java.util.Scanner;
public class ex7{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int quociente = 0;

        System.out.print("Por favor, informe um numero: ");
        n1 = leia.nextInt();
        System.out.print("Por favor, informe um numero: ");
        n2 = leia.nextInt();
        
        if (n2 == 0) {
            System.out.println("Erro: não é possível dividir por zero.");
        } else {
            quociente = n1 / n2;

            System.out.println("O quociente da divisão é: " + quociente);
        }   
        leia.close();
    }
}