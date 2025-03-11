// Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
// podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à
// esquerda, acima, à direita e abaixo de X, quando houver.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.print("Quantas linhas a matriz terá? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas a matriz terá? ");
        n = sc.nextInt();
        System.out.println();

        int[][] matriz = new int[m][n];

        System.out.println("Insira os valores para preencher a matriz: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        int x;
        System.out.print("Informe um valor x que pertenca a matriz: ");
        sc.nextLine();
        x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Posicao " + i + ", " + j + ":");
                    if(j > 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }
                    if(j < n-1){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if(i < m-1){
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}