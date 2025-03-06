// Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço
// médio dos produtos.

package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Digite a quantidade de produtos: ");
        N = sc.nextInt();

        Product[] vect = new Product[N];
        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Digite o preço do produto: $");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double media = sum / vect.length;

        System.out.printf("MEDIA DOS PRECOS: $%.2f%n", media);

        sc.close();
    }
}