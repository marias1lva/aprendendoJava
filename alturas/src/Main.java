// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar
// também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pessoas, menores;
        double alturaTotal, alturaMedia, percentualMenores;
        System.out.print("Quantas pessoas serao digitadas? ");
        pessoas = sc.nextInt();

        String[] nomes = new String[pessoas];
        int[] idades = new int[pessoas];
        double[] alturas = new double[pessoas];

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Dados da Pessoa " + (i + 1) + ": ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        menores = 0;
        alturaTotal = 0;

        for (int i = 0; i < pessoas; i++) {
            if(idades[i] < 16) {
                menores++;
            }
            alturaTotal += alturas[i];
        }

        alturaMedia = alturaTotal / pessoas;
        percentualMenores = ((double)menores / pessoas) * 100;

        System.out.println();
        System.out.printf("Altura media = %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i = 0; i < pessoas; i++) {
            if(idades[i] < 16) {
                System.out.printf("%s%n", nomes[i]);
            }
        }

        sc.close();
    }
}