// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, quantidade1, codigo2, quantidade2;
        double valor1, valor2, valorTotal;

        System.out.println("Digite os codigos, quantidades dos produtos e valores: ");
        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valorTotal = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);

        sc.close();
    }
}