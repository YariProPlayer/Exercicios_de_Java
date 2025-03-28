//Desenvolva um verificador de triângulos que identifique o tipo de triângulo baseado nos lados.
import java.util.Scanner;
public class ex11{
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;

        System.out.print("Por favor, informe um lado: ");
        l1 = leia.nextInt();
        System.out.print("Por favor, informe um lado: ");
        l2 = leia.nextInt();
        System.out.print("Por favor, informe um lado: ");
        l3 = leia.nextInt();

        if (l1 == l2 && l2 == l3) {
            System.out.println("O triangulo é Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("O triangulo é Isósceles"); 
        } else {
            System.out.println("O triangulo é Escaleno");  
        }

        leia.close();
    }
}