//Verificador de Idade: Crie um verificador de idade para identificar se uma pessoa pode votar.
import java.util.Scanner;
public class ex4{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int idade = 0;

        System.out.print("Por favor, informe a sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Você pode votar");
        }
        else{
            System.out.println("Você não pode votar");
        }
        leia.close();
    }
}

//O resultado sera assim:
/*Por favor, informe a sua idade: 18
Você pode votar*/