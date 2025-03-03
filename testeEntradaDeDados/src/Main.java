import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /* String:
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);*/

        /* Inteiro:
        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou: " + x);*/

        /* Double:
        double x;
        x = sc.nextDouble();
        System.out.println("Voce digitou: " + x);*/

        /* Char:
        char x;
        x = sc.next().charAt(0); // Pega o primeiro caracter
        System.out.println("Voce digitou: " + x);*/

        // Para ler mais de um dado em uma linha
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}