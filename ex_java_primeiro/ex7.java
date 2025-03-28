//Crie um sistema que calcule o IMC (Índice de Massa Corporal) e classifique o resultado.
import java.util.Scanner;

public class ex7 {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        float peso = 0;
        float altura = 0;
        float imc = 0;
        String classe = "";

        System.out.print("Por favor, digite seu peso em Kg: ");
        peso = leia.nextFloat();  

        System.out.print("Por favor, digite sua altura em metros: ");
        altura = leia.nextFloat();  

        imc = peso / (altura * altura); 

        if (imc < 18.5) {
            classe = "Abaixo do peso";
        } else if (imc < 24.9) {
            classe = "Peso normal";
        } else if (imc < 29.9) {
            classe = "Sobrepeso";
        } else if (imc < 34.9) {
            classe = "Obesidade grau 1";
        } else if (imc < 39.9) {
            classe = "Obesidade grau 2";
        } else {
            classe = "Obesidade grau 3";
        }

        System.out.printf("Seu IMC é: %.2f\n", imc);  
        System.out.println("Classificação: " + classe);
        leia.close();
    }
}
