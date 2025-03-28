//Faça um algoritmo que determine o maior e o menor valor entre três números.
import java.util.Scanner;

public class ex9{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        // Solicita ao usuário os três números
        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        num3 = leia.nextInt();

        int maior = num1;
        int menor = num1;
        
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
        leia.close();
    }
}
