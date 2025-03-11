// Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal
// principal e a quantidade de valores negativos da matriz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Informe a ordem da matriz: ");
        n = sc.nextInt();

        System.out.println();
        System.out.println("Informe os valores para preencher a matriz: ");
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Diagonal principal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();

        int negativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    negativos++;
                }
            }
        }
        System.out.println("Numeros negativos = " + negativos);

        sc.close();
    }
}