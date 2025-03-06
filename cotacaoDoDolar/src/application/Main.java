// Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a
// pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
// para ser responsável pelos cálculos.

package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice, amount;
        System.out.print("What is the dollar price? R$");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? $");
        amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais: R$ %.2f%n", result);

        sc.close();
    }
}