// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa
// decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
// valor tem peso 5.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double a, b, c, mediaPonderada = 0;
        System.out.print("Digite a quantidade de casos de teste: ");
        N = sc.nextInt();
        System.out.println("Digite os valores dos conjuntos: ");

        for (int i = 0; i < N; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            mediaPonderada = (2.0 * a + 3.0 * b + 5.0 * c) / 10.0;
            System.out.printf("%.1f%n", mediaPonderada);
        }

        sc.close();
    }
}