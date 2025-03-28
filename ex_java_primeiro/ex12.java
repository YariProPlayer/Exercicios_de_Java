//Faça um programa que converta a nota de um aluno de 0-10 para conceito (MB, B, R, I).
import java.util.Scanner;
public class ex12{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        float nota = 0;

        System.out.print("Por favor, informe sua nota: ");
        nota = leia.nextFloat();

        if (nota >= 9.0) {
            System.out.println("Você recebeu MB"); 
        } else if (nota >= 7.0) {
            System.out.println("Você recebeu B"); 
        } else if (nota >= 5.0) {
            System.out.println("Você recebeu R"); 
        } else {
            System.out.println("Você recebeu I"); 
        }

        leia.close();
    }
}
