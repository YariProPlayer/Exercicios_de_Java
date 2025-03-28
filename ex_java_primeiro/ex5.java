//Verificador de Idade: Desenvolva um conversor de temperatura de Celsius para Fahrenheit com validação de entrada.
import java.util.Scanner;
public class ex5{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        float celsius = 0;
        float fahrenheit = 0;

        System.out.print("Por favor, informe a tempertura em Celsius: ");
        celsius = leia.nextInt();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é "+fahrenheit+".");
        leia.close();
    }
}

