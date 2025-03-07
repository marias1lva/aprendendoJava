// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double soma = 0, media = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vetor = new double[N];
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media = soma / N;

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }

        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}