// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahreinheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
// digite "s", repetir o programa.
// Fórmula: F = (9C/5) + 32

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            double celsius, fahrenheit;
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();;
            fahrenheit = (9 * celsius / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        } while(resposta != 'n');

        sc.close();
    }
}