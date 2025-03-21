import java.util.Scanner;

public class exercicios01{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        String nome = "";
        //Println = screve a informação e muda de linha
        //print = Escreve a informação e sem mantem na linha

        System.out.print("Por favor, informe o seu acesso: ");
        nome = leia.nextLine();
        
        if(nome.equals("escola")){
            System.out.println("Acesso liberado");
        }
        else{
            System.out.println("Acesso negado");
        }

        /*if (idade > 18){
            System.out.println("Voce ja pode votar.");
        }
        else{
            System.out.println("Você ainda nao pode votar");
        }*/
    }
}