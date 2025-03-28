//Faça um programa que determine se um número é par ou ímpar.
import java.util.Scanner;
public class ex6{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.print("Por favor, informe um número: ");
        n1 = leia.nextInt();
        if (n1 % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é ímpar");
        }
        leia.close();
    }
}
