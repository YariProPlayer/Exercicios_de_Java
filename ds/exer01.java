//Crie um programa que leia o nome e a idade de uma pessoa e imprima uma mensagem personalizada.
import java.util.Scanner;
public class exer01{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        String nome = "";

        System.out.print("Por favor, informe o seu nome: ");
        nome = leia.nextLine();
        System.out.print("Por favor, informe a sua idade: ");
        idade = leia.nextInt();
        
        if (idade >= 16){
            System.out.println("Voce ja pode votar, "+nome+".");
        }
        else{
            System.out.println("Você ainda nao pode votar, "+nome+".");
        }
    }
}

//O resultado sera assim:
/*Por favor, informe o seu nome: raquel
Por favor, informe a sua idade: 16
Voce ja pode votar, raquel.*/