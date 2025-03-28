//Desenvolva um programa que verifique se um ano é bissexto.
import java.util.Scanner;
public class ex8{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int ano = 0;

        System.out.print("Por favor, informe um ano qualquer: ");
        ano = leia.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        leia.close();
    }
}