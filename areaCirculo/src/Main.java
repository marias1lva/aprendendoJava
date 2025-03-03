// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas
// decimais conforme exemplos:
// Fórmula da área: area = pi * raio^2
// Considere o valor de pi = 3.14159.

import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14159;

        System.out.print("Raio: ");
        raio = sc.nextDouble();
        area = pi * (raio * raio);
        // area = pi * (Math.sqrt(raio);
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}