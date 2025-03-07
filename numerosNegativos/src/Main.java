// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida,
// mostrar na tela todos os números negativos lidos.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N,i;
        System.out.print("Quantos numeros voce vai digitar(max = 10)? ");
        N = sc.nextInt();

        int[] vect = new int[N];

        for (i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            vect[i] = num;


        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}