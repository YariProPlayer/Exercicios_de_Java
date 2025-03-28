//Faça um programa que calcule a média de três notas e verifique se o aluno foi aprovado (média >= 7).
import java.util.Scanner;
public class ex3{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float media = 0;

        System.out.print("Por favor, informe a sua primeira nota: ");
        n1 = leia.nextFloat();
        System.out.print("Por favor, informe a sua segunda nota: ");
        n2 = leia.nextFloat();
        System.out.print("Por favor, informe a sua terceira nota: ");
        n3 = leia.nextFloat();

        media = (n1 + n2 + n3) / 3;
        
        if (media >= 7){
            System.out.println("Você foi aprovado");
        }
        else{
            System.out.println("Você não foi aprovado");
        }
        leia.close();
    }
}

//O resultado sera assim:
/*java exer04.java
Por favor, informe a sua primeira nota: 10
Por favor, informe a sua segunda nota: 9
Por favor, informe a sua terceira nota: 8
Você foi aprovado*/