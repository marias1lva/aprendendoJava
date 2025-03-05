// Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalN, N, soma = 0;
        System.out.print("Informe quantos numeros serao lidos: ");
        totalN = sc.nextInt();
        System.out.print("Digite os numeros: ");
        for(int i = 0; i < totalN; i++){
            N = sc.nextInt();
            soma += N;
        }
        System.out.println("A soma dos numeros digitados eh: " + soma);
        sc.close();
    }
}